package by.bsuir.web.oop.service;

import by.bsuir.web.oop.service.impl.ApplianceServiceImpl;

/**
 * Factory class for providing services.
 */
public final class ServiceFactory {

    private static ServiceFactory instance;

    private ApplianceService applianceService;

    private ServiceFactory() {
    }

    /**
     * Synchronized access point to {@link ServiceFactory}.
     *
     * @return factory instance
     */
    public static synchronized ServiceFactory getInstance() {
        if (instance == null) {
            instance = new ServiceFactory();
        }
        return instance;
    }

    /**
     * Synchronized access point to {@link ApplianceService}.
     *
     * @return {@link ApplianceService} instance
     */
    public synchronized ApplianceService getApplianceService() {
        if (applianceService == null) {
            applianceService = new ApplianceServiceImpl();
        }
        return applianceService;
    }
}
