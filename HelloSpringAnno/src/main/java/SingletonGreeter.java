public class SingletonGreeter {

    String welcomeMessage;

    public SingletonGreeter (String welcomeMessage) {
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
