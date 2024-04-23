
public class Main {

    public static void main(String[] args) {
        Message message = new Message("Chris", "This is a string.");
        MessagingService service = new MessagingService();
        service.add(message);
        service.getMessages();
    }
}
