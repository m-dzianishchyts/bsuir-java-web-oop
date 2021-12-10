package by.bsuir.web.oop.entity.criteria;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Criteria for filtering objects
 */
public class Criteria {

    private final String typeName;
    private final Map<String, Object> criteriaMap = new LinkedHashMap<>();

    private Criteria(String typeName) {
        this.typeName = typeName;
    }

    public static Criteria empty() {
        return new Criteria(null);
    }

    /**
     * Creates criteria for all objects types.
     *
     * @param criterionName  criterion name
     * @param criterionValue criterion value
     */
    public Criteria consider(String criterionName, Object criterionValue) {
        return new Criteria(null).alsoConsider(criterionName, criterionValue);
    }

    /**
     * Creates criteria for the specified objects type.
     *
     * @param typeName - objects type name
     */
    public Criteria consider(String typeName) {
        return new Criteria(typeName);
    }

    public String getTypeName() {
        return typeName;
    }

    /**
     * Adds new criterion for objects filtering.
     *
     * @param criterionName  criterion name
     * @param criterionValue criterion criterionValue
     */
    public Criteria alsoConsider(String criterionName, Object criterionValue) {
        criteriaMap.put(criterionName, criterionValue);
        return this;
    }

    public Map<String, Object> getCriteriaMap() {
        return Map.copyOf(criteriaMap);
    }
}