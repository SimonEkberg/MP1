package facade;

import element.DocElementInterface;
import element.composite.Document;
import visitor.LatexVisitor;

public class LatexDocumentFacade implements DocumentFacadeInterface {

    @Override
    public String render(Document document) {
        LatexVisitor visitor = new LatexVisitor();

        // Initiera visitor med dokumentets titel och startelement
        visitor.visitDocument(document);

        // Låt visitorn besöka varje element i dokumentet
        for (DocElementInterface element : document) {
            element.accept(visitor);
        }

        // Avsluta dokumentet och hämta LaTeX-strängen
        return visitor.getResult();
    }
}
