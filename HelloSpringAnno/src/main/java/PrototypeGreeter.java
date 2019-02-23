public class PrototypeGreeter {

    String welcomeMessage;

    public PrototypeGreeter(String welcomeMessage) {
       setWelcomeMessage(welcomeMessage);
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    @Override
    public String toString() {
        return welcomeMessage;

    }
}
