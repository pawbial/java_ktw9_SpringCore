package pl.sdacademy.springDI.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println(beanName + " after initialization");
        return bean;
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println(beanName + " before initialization");
        return bean;
    }
}
