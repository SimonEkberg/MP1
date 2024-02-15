package builder;

public interface EmailBuilder extends DocumentBuilder {
    EmailBuilder buildSender(String sender);
    EmailBuilder buildReceiver(String receiver);

}
