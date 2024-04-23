import java.util.ArrayList;

public class MessagingService {
    ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            System.out.println(message.getContent() + " added.");
            messages.add(message);
        }

    }

    public ArrayList<Message> getMessages() {
        return this.messages;

    }

}
