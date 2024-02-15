package builder;

public class Director {
    private DocumentBuilder builder;

    public Director(DocumentBuilder builder) {
        this.builder = builder;
    }
    public void constructEmail(String subject, String body, String receiver, String sender) {
                    builder.buildHeader("Subject: "+subject)
                            .buildParagraph("Content: "+body)
                            .buildReceiver("To: "+receiver)
                            .buildSender("From: "+sender)
                            .build();
    }
}
