package exer11;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World from the Application the bean its own setters and getters!";
    }

}