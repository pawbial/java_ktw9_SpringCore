package pl.sdacademy.springDI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sdacademy.springDI.beans.Tool;
import pl.sdacademy.springDI.beans.Worker;
import pl.sdacademy.springDI.beans.WorkerMotto;

public class SpringDIApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});

        Tool tool = (Tool) context.getBean("hammer");

        WorkerMotto wiseMotto = (WorkerMotto) context.getBean("wiseMotto");

        Worker worker = (Worker) context.getBean("worker");


        System.out.println(tool.getName() + " " + tool.getWeight());

        System.out.println(wiseMotto.getMotto());

        System.out.println(worker.toString());

        Tool hammer1 = (Tool) context.getBean("hammer");
        Tool hammer2 = (Tool) context.getBean("hammer");
        Tool hammer3 = (Tool) context.getBean("hammer");
        Tool hammer4 = (Tool) context.getBean("hammer");

        System.out.println(hammer1);
        System.out.println(hammer2);
        System.out.println(hammer3);
        System.out.println(hammer4);

    }
}
