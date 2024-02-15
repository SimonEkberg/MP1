package builder;

import element.Header;
import element.Paragraph;
import element.composite.Document;

public class ConcreteEmailBuilder implements EmailBuilder {
    private Email email;

    public ConcreteEmailBuilder() {
        this.email = new Email();
    }
    @Override
    public ConcreteEmailBuilder buildHeader(String subject) {
        email.setSubject(subject);
        return this;
    }
    @Override
    public ConcreteEmailBuilder buildParagraph(String body) {
        email.setBody(body);
        return this;
    }
    @Override
    public ConcreteEmailBuilder buildReceiver(String receiver){
        email.setReciever(receiver);
        return this;
    }

    @Override
    public ConcreteEmailBuilder buildSender(String sender){
        email.setSender(sender);
        return this;
    }
    @Override
    public Document build() {
        Document document = new Document();
        document.addElement(new Paragraph(email.getReciever()));
        document.addElement(new Header(email.getSubject()));
        document.addElement(new Paragraph(email.getBody()));
        document.addElement(new Paragraph(email.getSender()));
        return document;
    }
}
