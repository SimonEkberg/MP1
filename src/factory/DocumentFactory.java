/*package factory;

import facade.DocumentFacadeInterface;
import facade.HtmlDocumentFacade;
import facade.LatexDocumentFacade;
import facade.TextDocumentFacade;

public class DocumentFactory implements DocumentFactoryInterface{
    @Override
    public DocumentFacadeInterface createTextDokument(DocumentType type) {
        if (type == null) {
            System.out.println("No such Dokument: " + type);
            return null;
        }
        return switch (type) {
            case TEXT -> (new TextDocumentFacade());
            case HTML -> (new HtmlDocumentFacade());
            case LATEX -> (new LatexDocumentFacade());
        };
    }
}*/
