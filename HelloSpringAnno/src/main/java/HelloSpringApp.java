import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloSpringConfig.class);

        HelloSpring bean = context.getBean(HelloSpring.class);
        SingletonGreeter bean2 = context.getBean(SingletonGreeter.class);
        SingletonGreeter beam3 = context.getBean(SingletonGreeter.class);
        PrototypeGreeter bean4 = context.getBean(PrototypeGreeter.class);
        PrototypeGreeter bean5 = context.getBean(PrototypeGreeter.class);

        System.out.println(bean);
        System.out.println(bean2);
        System.out.println(beam3);
        System.out.println(bean4);
        System.out.println(bean5);

        System.out.println("===========");

        System.out.println(bean2.equals(beam3));
        System.out.println(bean4.equals(bean5));
    }
}
