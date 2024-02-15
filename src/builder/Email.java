package builder;

public class Email {
    String subject;
    String body;
    EmailAddress reciever;
    EmailAddress sender;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getReciever() {
        return reciever.getEmailString();
    }

    public void setReciever(String reciever) {
        this.reciever = new EmailAddress(reciever);
    }

    public String getSender() {
        return sender.getEmailString();
    }

    public void setSender(String sender) {
        this.sender = new EmailAddress(sender);
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}