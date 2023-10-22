import java.util.ArrayList;

public class MessagePublisher {
    Observer observer;
    String Message;
    ArrayList<Observer> observers = new ArrayList<>();

    public MessagePublisher(String currentMessage){
        this.Message = currentMessage;
    }


    public void setMessage(String message) {
        Message = message;
    }

    public String getMessage() {
        return Message;
    }

    public void registerObserver(){};
    public void removeObserver(){};
    public void notifyObserver(){};
}
