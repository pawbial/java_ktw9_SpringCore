import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloSpringConfig {

    @Bean
    public HelloSpring helloSpring () {
        return new HelloSpring("Hello 123456");
    }


    @Bean
    @Scope ("singleton")
    public SingletonGreeter helloSingleton () {
        return new SingletonGreeter("Hello Singleton");
    }

    @Bean
    @Scope("prototype")
    public PrototypeGreeter helloPrototype () {
        return new PrototypeGreeter("Hello Prototype");
    }



}
