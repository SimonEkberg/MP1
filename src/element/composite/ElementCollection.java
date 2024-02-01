package element.composite;

import element.DocElementInterface;
import element.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ElementCollection implements DocElementInterface, Iterable<DocElementInterface>{
    protected List<DocElementInterface> elementList;
    public ElementCollection(){
        this.elementList = new ArrayList<>();
    }
    public abstract void addElement(DocElementInterface element);
    public abstract void updateElement(DocElementInterface element);
    public abstract void deleteElement(DocElementInterface element);
 //   public abstract Element getElement(int index);
    public Iterator<DocElementInterface> iterator(){
     return elementList.iterator();
    }

}