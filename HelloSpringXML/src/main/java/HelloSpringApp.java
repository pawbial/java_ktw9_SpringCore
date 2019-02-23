import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloSpring bean = (HelloSpring) context.getBean("helloSpring");

        SingletonGreeter helloSingleton = (SingletonGreeter) context.getBean("helloSingleton");

        PrototypeGreeter prototypeGreeter = (PrototypeGreeter) context.getBean("helloPrototype");

        System.out.println(bean.getWelcomeMessage());

        System.out.println(helloSingleton.getWelcomeMessage());

        System.out.println(prototypeGreeter.getWelcomeMessage());

    }
}
