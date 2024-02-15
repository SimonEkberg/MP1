package builder;

public abstract class AbstractEmailBuilder implements EmailBuilder {

    abstract AbstractEmailBuilder setSubject(String subject);
    abstract AbstractEmailBuilder setBody(String body);
    abstract AbstractEmailBuilder setSender(EmailAddress sender);
    abstract AbstractEmailBuilder setReceiver(EmailAddress receiver);
   // public abstract Document build();
}
