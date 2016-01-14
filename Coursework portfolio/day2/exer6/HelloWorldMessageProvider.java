package exer6;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World from a MessageSupportFactory!";
    }

}