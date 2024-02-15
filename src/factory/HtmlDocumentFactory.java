package factory;

import facade.DocumentFacadeInterface;
import facade.HtmlDocumentFacade;

public class HtmlDocumentFactory extends AbstractDocumentFactory{
    @Override
    public DocumentFacadeInterface createDocumentConverter() {
        return new HtmlDocumentFacade();
    }
}
