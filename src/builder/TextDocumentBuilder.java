package builder;

import element.composite.Document;

public class TextDocumentBuilder implements DocumentBuilder{
    @Override
    public DocumentBuilder buildHeader(String text) {
        return null;
    }

    @Override
    public DocumentBuilder buildParagraph(String text) {
        return null;
    }

    @Override
    public EmailBuilder buildReceiver(String receiver) {
        return null;
    }

    @Override
    public Document build() {
        return null;
    }
}
