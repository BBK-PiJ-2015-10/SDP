package exer7;

public interface MessageRenderer {

    void render();
    
    void setMessageProvider(MessageProvider provider);
    
    MessageProvider getMessageProvider();
    
}
