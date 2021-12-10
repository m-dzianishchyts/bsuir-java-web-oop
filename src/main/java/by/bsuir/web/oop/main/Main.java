package by.bsuir.web.oop.main;

import by.bsuir.web.oop.entity.Appliance;
import by.bsuir.web.oop.entity.ApplianceProperties;
import by.bsuir.web.oop.entity.ApplianceTypes;
import by.bsuir.web.oop.entity.criteria.Criteria;
import by.bsuir.web.oop.service.ApplianceService;
import by.bsuir.web.oop.service.ApplianceServiceException;
import by.bsuir.web.oop.service.ServiceFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ApplianceService applianceService = ServiceFactory.getInstance().getApplianceService();
        try {
            List<Appliance> appliances = applianceService.findAllAppliances();
            logger.info("List of appliances:");
            appliances.forEach(logger::info);

            List<Appliance> televisions =
                    applianceService.findAppliancesByCriteria(Criteria.consider(ApplianceTypes.TELEVISION));
            logger.info("List of televisions:");
            televisions.forEach(logger::info);

            List<Appliance> samsungAppliances =
                    applianceService.findAppliancesByCriteria(Criteria.consider(ApplianceProperties.MANUFACTURER,
                                                                                "Samsung"));
            logger.info("List of Samsung appliances:");
            samsungAppliances.forEach(logger::info);

            Optional<Appliance> cheapestAppliance = applianceService.findCheapestAppliance();
            if (cheapestAppliance.isEmpty()) {
                logger.info("The cheapest appliance is not present.");
            } else {
                logger.info("The cheapest appliance: {}", cheapestAppliance.get());
            }
        } catch (ApplianceServiceException e) {
            e.printStackTrace();
        }
    }
}
