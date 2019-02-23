package pl.sdacademy.springDI.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Tool implements InitializingBean {

    private String name;
    private Integer weight;

    public Tool () {

    }

    public Tool(String name, Integer weight) {
        this.name = name + (int) (Math.random() * 100);
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return name + ", weight " + weight;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Tools after properties set");
    }
}

