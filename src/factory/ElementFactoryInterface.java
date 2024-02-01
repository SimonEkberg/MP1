package factory;

import element.DocElementInterface;
import element.Element;
import element.composite.ElementCollection;

public interface ElementFactoryInterface {
    Element createDocElement(ElementType elementType, String text);
    ElementCollection createDocElementCollection(CollectionType collectionType);
}
