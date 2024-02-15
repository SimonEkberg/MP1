/*package factory;

import facade.DocumentFacadeInterface;

import java.util.HashMap;

public abstract class AbstractDocumentFactory {
    private static HashMap<Object, AbstractDocumentFactory> map = new HashMap<Object, AbstractDocumentFactory>();

    static {
        DocumentConverterFactory.convert();
    }

    protected static void createFactory(Object key, AbstractDocumentFactory af) {

        map.put(key, af);
    }

    public static AbstractDocumentFactory getFactory(Object selector) {

        AbstractDocumentFactory result = map.get(selector);

        if(selector == null) {
            throw new NullPointerException("There is no such value in the selector.");
        } else
            return result;
    }*/

 //   public abstract DocumentFacadeInterface createConverter(DocumentType documentType);
  //  public abstract HtmlDocumentFacade createHTMLConverter();
  //  public abstract LatexDocumentFacade createLaTEXConverter();
//}

package factory;

import facade.DocumentFacadeInterface;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDocumentFactory {
    private static final Map<DocumentType, AbstractDocumentFactory> factories = new HashMap<>();

    public static void registerFactory(DocumentType type, AbstractDocumentFactory factory) {
        factories.put(type, factory);
    }

    public static AbstractDocumentFactory getFactory(DocumentType type) {
        AbstractDocumentFactory factory = factories.get(type);
        if (factory == null) {
            throw new IllegalArgumentException("No factory registered for type: " + type);
        }
        return factory;
    }

    public abstract DocumentFacadeInterface createDocumentConverter();
}

