package by.bsuir.web.oop.dao;

import by.bsuir.web.oop.dao.impl.XmlApplianceDaoImpl;

/**
 * Factory class for DAO providing.
 */
public final class DaoFactory {

    private static DaoFactory instance;

    private ApplianceDao applianceDAO;

    private DaoFactory() {
    }

    /**
     * Synchronized access point to {@link DaoFactory}.
     *
     * @return factory instance
     */
    public static synchronized DaoFactory getInstance() {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }

    /**
     * Synchronized access point to {@link ApplianceDao}.
     *
     * @return {@link ApplianceDao} instance
     */
    public synchronized ApplianceDao getApplianceDAO() {
        if (applianceDAO == null) {
            applianceDAO = new XmlApplianceDaoImpl();
        }
        return applianceDAO;
    }
}
