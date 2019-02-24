package pl.sdacademy.springDI;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import pl.sdacademy.springDI.beans.GarageService;
import pl.sdacademy.springDI.configuration.ApplicationConfig;

import java.util.logging.Logger;

public class ApplicationMain {

    //Poprzez metodę LOG.info lepiej to wygląda niż zwykły sout
    private static final Logger LOG = Logger.getLogger(ApplicationMain.class.getName());

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ApplicationConfig.class);

        GarageService service = (GarageService) context.getBean("garageService");

        LOG.info("++++++++++++++++++++++++++++++++++++");

        LOG.info(service.getWorker().toString());

        LOG.info(LOG.getName());

        LOG.info(String.valueOf(context.getBean("worker")));

    }
}
