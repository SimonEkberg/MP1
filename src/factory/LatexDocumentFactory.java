package factory;

import facade.DocumentFacadeInterface;
import facade.LatexDocumentFacade;

public class LatexDocumentFactory extends AbstractDocumentFactory{
    @Override
    public DocumentFacadeInterface createDocumentConverter() {
        return new LatexDocumentFacade();
    }
}
