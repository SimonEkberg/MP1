package factory;

import element.*;
import element.composite.ElementCollection;
import element.composite.ListElement;

public class ElementFactory implements ElementFactoryInterface{

    @Override
    public Element createDocElement(ElementType elementType, String text) {
        if (elementType == null) {
            System.out.println("No such Element: " + elementType);
            return null;
        }
        return switch (elementType) {
            case HEADER -> (new Header(new ElementText(text)));
            case PARAGRAPH -> (new Paragraph());

        };
    }

    @Override
    public ElementCollection createDocElementCollection(CollectionType collectionType) {
        if (collectionType == null) {
            System.out.println("No such Element: " + collectionType);
            return null;
        }
        return switch (collectionType) {
            case LIST -> new ListElement();
            case TABLE -> null;
        };
    }
}
