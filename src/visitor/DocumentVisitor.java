package visitor;

import element.Header;
import element.Paragraph;
import element.composite.Document;
import element.composite.ListElement;

public interface DocumentVisitor {
    void visitHeader(Header header);
    void visitParagraph(Paragraph paragraph);
    void visitListElement(ListElement listElement);
    void visitDocument(Document document);


    // Lägg till fler visit-metoder för andra elementtyper.

    String getResult(); // För att hämta konverteringsresultatet.
}
