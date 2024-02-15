package builder;

import element.composite.Document;

public interface DocumentBuilder {
    DocumentBuilder buildHeader(String text);
    DocumentBuilder buildParagraph(String text);
    EmailBuilder buildReceiver(String receiver);
    Document build();


}
