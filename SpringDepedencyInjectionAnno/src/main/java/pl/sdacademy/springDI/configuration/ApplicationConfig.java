package pl.sdacademy.springDI.configuration;


import com.sun.corba.se.spi.orbutil.threadpool.Work;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.sdacademy.springDI.beans.Worker;

@Configuration
@ComponentScan("pl.sdacademy.springDI.beans")
public class ApplicationConfig {


    @Bean
    public Worker mechanic () {
        Worker worker = new Worker();
        worker.setName("mechanic");
        return worker;
    }
}
