package factory;

import element.Element;
import element.composite.ElementCollection;
import facade.LatexDocumentFacade;

public interface ElementFactoryInterface {
    Element createDocElement(ElementType elementType, String text);
    ElementCollection createDocElementCollection(CollectionType collectionType);

}
