package pl.sdacademy.springDI;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import pl.sdacademy.springDI.beans.GarageService;
import pl.sdacademy.springDI.configuration.ApplicationConfig;

public class ApplicationMain {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ApplicationConfig.class);

        GarageService service = (GarageService) context.getBean("garageService");

        System.out.println(service.getWorker().toString());

    }
}
