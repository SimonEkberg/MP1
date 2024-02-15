import builder.BuilderType;
import builder.EmailBuilder;
import builder.Director;
import builder.ConcreteEmailBuilder;
import element.DocElementInterface;
import element.Element;
import element.composite.Document;
import facade.DocumentFacadeInterface;
import facade.HtmlDocumentFacade;
import facade.TextDocumentFacade;
import factory.*;
import element.composite.ElementCollection;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ElementFactoryInterface factory = new ElementFactory();
        Element header = factory.createDocElement(ElementType.HEADER, "En header");
        Element paragraph = factory.createDocElement(ElementType.PARAGRAPH, "En paragraf");
        ElementCollection list = factory.createDocElementCollection(CollectionType.LIST);
        list.addElement(header);
        list.addElement(paragraph);
        list.setListName("En ny Lista:");
      //  DocumentFactoryInterface docFactory = new DocumentFactory();
     //   DocumentFacadeInterface textDocumentFacade = docFactory.createTextDokument(DocumentType.TEXT);
  /*      textDocumentFacade.addHeader("Rubrik");
        textDocumentFacade.addParagraph("Textdokumentets brödtext kan läggas här");
        textDocumentFacade.addList(List.of("Här", "Kan", "Man", "Skapa", "Listor"));
        textDocumentFacade.addParagraph(list.getListName());
        for ( DocElementInterface element: list) {
            textDocumentFacade.addList(List.of(element.render()));
        }


        ElementCollection doc = new Document();
      //  System.out.println(textDocumentFacade.render());
        EmailBuilder emailBuilder = new ConcreteEmailBuilder();
        Director director = new Director(emailBuilder);
// Constructing the email document
        director.constructEmail("Hello", "This is the email body", "receiver@example.com", "sender@example.com");
// Retrieve the constructed email document
        Document emailDocument = emailBuilder.build();
        emailDocument.addElement(emailBuilder.build());
        Iterator k = doc.iterator();
        System.out.println("Mail:");
        for(DocElementInterface e : emailDocument){
            System.out.println(e.render());
        }*/


        /*
        ElementFactoryInterface factory = new ElementFactory();
        Element header = factory.createDocElement(ElementType.HEADER, "En header");
        Element paragraph = factory.createDocElement(ElementType.PARAGRAPH, "En paragraf");

        ElementCollection list = factory.createDocElementCollection(CollectionType.LIST);
        list.addElement(header);
        list.addElement(paragraph);

        System.out.println(list.render());

     //   col.addElement(para);
        header.setElementText("Updaterad header");
      //  list.addElement(header2);
        list.addElement(header3);
        list2.addElement(header);
     //   list.deleteElement(header);
        System.out.println(list.render());
        System.out.println("*************");
     //   System.out.println(list2.render());
        list.addElement(list2);
        list.addElement(factory.createDocElement(ElementType.HEADER, "En till!"));

        Iterator i = list.iterator();
        System.out.println("it consists of:");
        while(i.hasNext())
            System.out.println("*"+i.next());

        ElementCollection list3 = list2;
        System.out.println("**********");
        ElementCollection doc = new Document();
        doc.addElement(list);
        doc.addElement(list3);
        list3.setListName("Listans lista");
        Iterator j = doc.iterator();
        System.out.println("Doc consists of:");
        for(DocElementInterface e : doc){
            System.out.println(e.render());
        }
        EmailBuilder emailBuilder = new ConcreteEmailBuilder();
        Director director = new Director(emailBuilder);

// Constructing the email document
        director.constructEmail("Hello", "This is the email body", "receiver@example.com", "sender@example.com");

// Retrieve the constructed email document
        Document emailDocument = emailBuilder.build();
        Iterator k = doc.iterator();
        System.out.println("Mail:");
        for(DocElementInterface e : emailDocument){
            System.out.println(e.render());
        }
*/
        System.out.println("************************");

        DocumentFacadeInterface facade = new HtmlDocumentFacade();

        // Adding elements to the document
     //   facade.addHeader("Document Title");
   //     facade.addParagraph("This is an introductory paragraph describing the purpose of the document.");
    //    facade.addList(List.of("First item", "Second item", "Third item"));

        // Rendering document

   //     System.out.println(facade.render());
        System.out.println("************************");

      /*  DocumentFactoryInterface docFactory = new DocumentFactory();
        DocumentFacadeInterface textDocumentFacade = docFactory.createTextDokument(DocumentType.TEXT);
        textDocumentFacade.addHeader("Document Title");
        textDocumentFacade.addParagraph("Here we can add some text for the document.");
        textDocumentFacade.addList(List.of("First list item", "Second list item", "Third list item"));
        System.out.println(textDocumentFacade.render());*/



        }
}