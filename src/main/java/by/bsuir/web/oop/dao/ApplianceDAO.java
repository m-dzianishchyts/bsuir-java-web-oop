package by.bsuir.web.oop.dao;

import by.bsuir.web.oop.entity.Appliance;
import by.bsuir.web.oop.entity.criteria.Criteria;

import java.util.List;
import java.util.Optional;

/**
 * DAO Interface for accessing appliance entities.
 */
public interface ApplianceDAO {

    /**
     * Find all appliances in data source.
     *
     * @return list of found appliance entities
     */
    List<Appliance> findAll() throws ApplianceDAOException;

    /**
     * Find all appliances in data source that meet criteria.
     *
     * @return list of found appliance entities
     */
    List<Appliance> findByCriteria(Criteria criteria) throws ApplianceDAOException;

    /**
     * Find appliances by id in data source.
     *
     * @return empty {@link Optional} if no appliances entities with the specified id exist in data source,
     * {@link Optional} with entity inside otherwise
     */
    Optional<Appliance> find(int id) throws ApplianceDAOException;

    /**
     * Save appliance into data source.
     */
    void save(Appliance newAppliance) throws ApplianceDAOException;

    /**
     * Update appliance in data source by id.
     */
    void update(int id, Appliance updateAppliance) throws ApplianceDAOException;

    /**
     * Delete appliance from data source by id.
     */
    void delete(int id) throws ApplianceDAOException;
}
