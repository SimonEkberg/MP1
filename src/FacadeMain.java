import element.Element;
import element.composite.Document;
import element.composite.ElementCollection;
import facade.DocumentFacadeInterface;
import factory.*;

public class FacadeMain {
    public static void main(String[] args) {

        ElementFactoryInterface factory = new ElementFactory();
        Element header = factory.createDocElement(ElementType.HEADER, "En header");
        Element paragraph = factory.createDocElement(ElementType.PARAGRAPH, "En paragraf");
        ElementCollection list = factory.createDocElementCollection(CollectionType.LIST);
        list.addElement(header);
        list.addElement(paragraph);
        list.setListName("En ny Lista:");
    //    DocumentFactoryInterface docFactory = new DocumentFactory();

        Document document = new Document();
        document.addElement(header);
        document.addElement(list);

        document.addElement(paragraph);
        document.setTitle("Testing facades");
        System.out.println(document.render());
        System.out.println("*******************");

        AbstractDocumentFactory.registerFactory(DocumentType.HTML, new HtmlDocumentFactory());
        AbstractDocumentFactory.registerFactory(DocumentType.LATEX, new LatexDocumentFactory());
        // Example: Getting a LaTeX converter
        AbstractDocumentFactory latexFactory = AbstractDocumentFactory.getFactory(DocumentType.LATEX);
        AbstractDocumentFactory htmlFactory = AbstractDocumentFactory.getFactory(DocumentType.HTML);

        DocumentFacadeInterface htmlConverter = htmlFactory.createDocumentConverter();
        DocumentFacadeInterface latexConverter = latexFactory.createDocumentConverter();


        System.out.println(htmlConverter.render(document));
        System.out.println(latexConverter.render(document));






    }
}
