package by.bsuir.web.oop.dao;

import by.bsuir.web.oop.dao.impl.XmlApplianceDaoImpl;

/**
 * Factory class for DAO providing.
 */
public final class DAOFactory {

    private static DAOFactory instance;

    private ApplianceDAO applianceDAO;

    private DAOFactory() {
    }

    /**
     * Synchronized access point to {@link DAOFactory}.
     *
     * @return factory instance
     */
    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
        return instance;
    }

    /**
     * Synchronized access point to {@link ApplianceDAO}.
     *
     * @return {@link ApplianceDAO} instance
     */
    public synchronized ApplianceDAO getApplianceDAO() {
        if (applianceDAO == null) {
            applianceDAO = new XmlApplianceDaoImpl();
        }
        return applianceDAO;
    }
}
