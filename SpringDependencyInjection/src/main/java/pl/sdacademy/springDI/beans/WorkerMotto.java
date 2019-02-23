package pl.sdacademy.springDI.beans;

public class WorkerMotto {

    private String motto;

    public WorkerMotto (){

    }
    public WorkerMotto(String motto) {
        this.motto = motto;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    @Override
    public String toString() {
        return  motto;
    }
}
