package by.bsuir.web.oop.service;

import by.bsuir.web.oop.entity.Appliance;
import by.bsuir.web.oop.entity.criteria.Criteria;

import java.util.List;
import java.util.Optional;

/**
 * Interface of appliance service.
 */
public interface ApplianceService {

    /**
     * Finds all appliances.
     *
     * @return all appliances
     */
    List<Appliance> findAllAppliances() throws ApplianceServiceException;

    /**
     * Finds all appliances satisfying the criteria.
     *
     * @param criteria criteria for appliances filtering
     * @return appliances satisfying the criteria
     */
    List<Appliance> findAppliancesByCriteria(Criteria criteria) throws ApplianceServiceException;

    /**
     * Finds the cheapest appliance from all the appliances.
     *
     * @return the cheapest appliance
     */
    Optional<Appliance> findCheapestAppliance() throws ApplianceServiceException;

    /**
     * Finds the cheapest appliance from all appliances satisfying the criteria.
     *
     * @param criteria criteria for appliances filtering
     * @return the cheapest appliance satisfying the criteria
     */
    Optional<Appliance> findCheapestApplianceByCriteria(Criteria criteria) throws ApplianceServiceException;
}
