package by.bsuir.web.oop.dao.impl;

import by.bsuir.web.oop.dao.ApplianceDao;
import by.bsuir.web.oop.dao.ApplianceDaoException;
import by.bsuir.web.oop.entity.Appliance;
import by.bsuir.web.oop.entity.Appliances;
import by.bsuir.web.oop.entity.criteria.Criteria;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Implementation of {@link ApplianceDao}.
 */
public class XmlApplianceDaoImpl implements ApplianceDao {

    public static final String PATH_TO_XML_FILES = "xml/appliance/appliances.xml";
    private Appliances appliances;

    private static List<Field> getAllDeclaredFields(Class<?> type) {
        List<Field> fields = new LinkedList<>();
        getAllDeclaredFieldsRecursive(fields, type);
        return fields;
    }

    private static void getAllDeclaredFieldsRecursive(List<Field> fields, Class<?> type) {
        fields.addAll(Arrays.stream(type.getDeclaredFields()).toList());
        if (type.getSuperclass() != null) {
            getAllDeclaredFieldsRecursive(fields, type.getSuperclass());
        }
    }

    @Override
    public synchronized List<Appliance> findAll() throws ApplianceDaoException {
        if (appliances == null) {
            loadAppliances();
        }

        return List.copyOf(appliances.getApplianceList());
    }

    @Override
    public List<Appliance> findByCriteria(Criteria criteria) throws ApplianceDaoException {
        if (appliances == null) {
            loadAppliances();
        }

        Predicate<Appliance> criteriaPredicate = null;
        if (criteria.getTypeName() != null) {
            criteriaPredicate = appliance -> appliance.getClass().getSimpleName()
                                                      .equalsIgnoreCase(criteria.getTypeName());
        }
        Map<String, Object> criteriaMap = criteria.getCriteriaMap();
        for (Map.Entry<String, Object> entry : criteriaMap.entrySet()) {
            String criterionName = entry.getKey();
            Object criterionValue = entry.getValue();
            Predicate<Appliance> nextPredicate = prepareFieldPredicate(criterionName, criterionValue);
            criteriaPredicate = tryAppendPredicate(criteriaPredicate, nextPredicate);
        }

        if (criteriaPredicate == null) {
            criteriaPredicate = appliance -> true;
        }
        List<Appliance> applianceList = appliances.getApplianceList().stream()
                                                  .filter(criteriaPredicate)
                                                  .toList();
        return applianceList;
    }

    @Override
    public synchronized Optional<Appliance> find(int id) throws ApplianceDaoException {
        if (appliances == null) {
            loadAppliances();
        }

        Optional<Appliance> optionalAppliance = appliances.getApplianceList().stream()
                                                          .filter(appliance -> appliance.getId() == id).findAny();
        return optionalAppliance;
    }

    @Override
    public synchronized void save(Appliance newAppliance) throws ApplianceDaoException {
        if (appliances == null) {
            loadAppliances();
        }

        boolean hasIdDuplicate = appliances.getApplianceList().stream()
                                           .anyMatch(appliance -> appliance.getId() == newAppliance.getId());
        if (hasIdDuplicate) {
            throw new ApplianceDaoException("ID duplicate: " + newAppliance.getId());
        }
        appliances.getApplianceList().add(newAppliance);
        saveAppliances();
    }

    @Override
    public synchronized void update(int id, Appliance updateAppliance) throws ApplianceDaoException {
        if (appliances == null) {
            loadAppliances();
        }

        boolean idExists = appliances.getApplianceList().stream()
                                     .anyMatch(personnelFile -> personnelFile.getId() == id);
        if (!idExists) {
            throw new ApplianceDaoException("ID not found: " + id);
        }
        List<Appliance> applianceList =
                appliances.getApplianceList().stream()
                          .map(appliance -> appliance.getId() == id ? updateAppliance : appliance)
                          .toList();
        appliances.setAppliancesList(applianceList);
        saveAppliances();
    }

    @Override
    public synchronized void delete(int id) throws ApplianceDaoException {
        if (appliances == null) {
            loadAppliances();
        }

        List<Appliance> applianceList = appliances.getApplianceList().stream()
                                                  .filter(appliance -> appliance.getId() == id)
                                                  .toList();
        appliances.setAppliancesList(applianceList);
        saveAppliances();
    }

    private <T> Predicate<T> tryAppendPredicate(Predicate<T> predicate, Predicate<T> appendPredicate) {
        if (predicate != null) {
            return predicate.and(appendPredicate);
        }
        return appendPredicate;
    }

    private Predicate<Appliance> prepareFieldPredicate(String criterionName, Object criterionValue) {
        return appliance -> {
            Optional<Field> optionalField = getAllDeclaredFields(appliance.getClass())
                    .stream().filter(field -> field.getName().equals(criterionName)).findAny();
            if (optionalField.isPresent() && optionalField.get().trySetAccessible()) {
                try {
                    return optionalField.get().get(appliance).equals(criterionValue);
                } catch (IllegalAccessException e) {
                    // ignore
                }
            }
            return false;
        };
    }

    private void loadAppliances() throws ApplianceDaoException {
        try (InputStream inputStream = new FileInputStream(PATH_TO_XML_FILES)) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Appliances.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            appliances = (Appliances) unmarshaller.unmarshal(inputStream);
        } catch (JAXBException | IOException e) {
            throw new ApplianceDaoException(e);
        }
    }

    private void saveAppliances() throws ApplianceDaoException {
        File outputFile = new File(PATH_TO_XML_FILES);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Appliances.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.marshal(appliances, outputFile);
        } catch (JAXBException e) {
            throw new ApplianceDaoException(e);
        }
    }
}
