import element.DocElementInterface;
import element.Element;
import factory.ElementFactory;
import element.composite.ElementCollection;
import factory.CollectionType;
import factory.ElementFactoryInterface;
import factory.ElementType;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ElementFactoryInterface factory = new ElementFactory();
        Element header = factory.createDocElement(ElementType.HEADER, "En header");
        Element header2 = factory.createDocElement(ElementType.HEADER, "En header2");
        Element header3 = factory.createDocElement(ElementType.HEADER, "En header3");
     //   element.setElementText("En header");


  //      DocElementInterface para = factory.createDocElement(ElementType.PARAGRAPH);
       // para.setElementText("En paragraf");

        ElementCollection list = factory.createDocElementCollection(CollectionType.LIST);
        ElementCollection list2 = factory.createDocElementCollection(CollectionType.LIST);
        list.addElement(header);
        list2.addElement(header);

     //   col.addElement(para);
        header.setElementText("Updaterad header");
        list.addElement(header2);
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
            System.out.println(i.next());






    }
}