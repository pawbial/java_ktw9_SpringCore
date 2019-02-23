package pl.sdacademy.springDI.beans;

import java.util.List;

public class Worker {

    private String name;
    private Integer age;
    private List<Tool> tools;
    private WorkerMotto workerMotto;


    public Worker (){

    }

    public Worker(String name, Integer age, List<Tool> tools, WorkerMotto workerMotto) {
        this.name = name;
        this.age = age;
        this.tools = tools;
        this.workerMotto = workerMotto;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
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
     tools.add(new Tool(name + "-tool",1));
    }
}