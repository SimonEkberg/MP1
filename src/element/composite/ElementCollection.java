package element.composite;

import element.DocElementInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ElementCollection implements DocElementInterface, Iterable<DocElementInterface>{
    protected List<DocElementInterface> elementList;
    public ElementCollection(){
        this.elementList = new ArrayList<>();
    }
    public abstract ListElement addElement(DocElementInterface element);
    public abstract void updateElement(DocElementInterface element);
    public abstract void deleteElement(DocElementInterface element);
    public abstract void setListName(String listName);
    public abstract String getListName();
    public Iterator<DocElementInterface> iterator(){
     return elementList.iterator();
    }
}