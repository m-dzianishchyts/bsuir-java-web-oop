package by.bsuir.web.oop.service.impl;

import by.bsuir.web.oop.dao.ApplianceDAO;
import by.bsuir.web.oop.dao.ApplianceDAOException;
import by.bsuir.web.oop.dao.DAOFactory;
import by.bsuir.web.oop.entity.Appliance;
import by.bsuir.web.oop.entity.criteria.Criteria;
import by.bsuir.web.oop.service.ApplianceService;
import by.bsuir.web.oop.service.ApplianceServiceException;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ApplianceServiceImpl implements ApplianceService {

    public List<Appliance> findAllAppliances() throws ApplianceServiceException {
        ApplianceDAO applianceDAO = DAOFactory.getInstance().getApplianceDAO();
        try {
            List<Appliance> appliances = applianceDAO.findAll();
            return appliances;
        } catch (ApplianceDAOException e) {
            throw new ApplianceServiceException(e);
        }
    }

    public List<Appliance> findAppliancesByCriteria(Criteria criteria) throws ApplianceServiceException {
        ApplianceDAO applianceDAO = DAOFactory.getInstance().getApplianceDAO();
        try {
            List<Appliance> appliances = applianceDAO.findByCriteria(criteria);
            return appliances;
        } catch (ApplianceDAOException e) {
            throw new ApplianceServiceException(e);
        }
    }

    public Optional<Appliance> findCheapestAppliance() throws ApplianceServiceException {
        ApplianceDAO applianceDAO = DAOFactory.getInstance().getApplianceDAO();
        try {
            List<Appliance> appliances = applianceDAO.findAll();
            Optional<Appliance> cheapestAppliance =
                    appliances.stream().min(Comparator.comparing(Appliance::getPrice, BigDecimal::compareTo));
            return cheapestAppliance;
        } catch (ApplianceDAOException e) {
            throw new ApplianceServiceException(e);
        }
    }

    public Optional<Appliance> findCheapestApplianceByCriteria(Criteria criteria) throws ApplianceServiceException {
        ApplianceDAO applianceDAO = DAOFactory.getInstance().getApplianceDAO();
        try {
            List<Appliance> appliances = applianceDAO.findByCriteria(criteria);
            Optional<Appliance> cheapestAppliance =
                    appliances.stream().min(Comparator.comparing(Appliance::getPrice, BigDecimal::compareTo));
            return cheapestAppliance;
        } catch (ApplianceDAOException e) {
            throw new ApplianceServiceException(e);
        }
    }
}



