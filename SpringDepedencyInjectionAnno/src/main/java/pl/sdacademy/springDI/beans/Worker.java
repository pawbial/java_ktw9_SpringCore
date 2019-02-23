package pl.sdacademy.springDI.beans;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Worker {

    private String name;
    private Integer age;
    private List<pl.sdacademy.springDI.beans.Tool> tools;
    private WorkerMotto workerMotto;


    public Worker (){

    }

    public Worker(String name, Integer age, List<pl.sdacademy.springDI.beans.Tool> tools, WorkerMotto workerMotto) {
        this.name = name;
        this.age = age;
        this.tools = tools;
        this.workerMotto = workerMotto;
    }

    public List<pl.sdacademy.springDI.beans.Tool> getTools() {
        return tools;
    }

    public void setTools(List<pl.sdacademy.springDI.beans.Tool> tools) {
        this.tools = tools;
    }

    public WorkerMotto getWorkerMotto() {
        return workerMotto;
    }

    public void setWorkerMotto(WorkerMotto workerMotto) {
        this.workerMotto = workerMotto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tools=" + tools +
                ", workerMotto=" + workerMotto +
                '}';
    }

    private void addDefaultTool() {
        tools.add(new pl.sdacademy.springDI.beans.Tool(name + "-tool",1));
    }
}