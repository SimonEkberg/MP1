package facade;

import element.Header;
import element.Paragraph;
import element.composite.Document;
import element.composite.ElementCollection;
import element.composite.ListElement;

import java.util.List;

public class TextDocumentFacade implements DocumentFacadeInterface{
    private ElementCollection document;

    public TextDocumentFacade() {
        this.document = new Document();
    }

    public void addHeader(String header) {
        document.addElement(new Header(header.toUpperCase()+"\n"));
    }

    public void addParagraph(String paragraph) {
        document.addElement(new Paragraph(paragraph));
    }

    public void addList(List<String> items) {
        ListElement listElement = new ListElement();
        items.forEach(item -> listElement.addElement(new Paragraph("- " + item)));
        document.addElement(listElement);
    }

    public String render() {
        return document.render();
    }

    @Override
    public String render(Document document) {
        return null;
    }
}
