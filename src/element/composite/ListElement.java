package element.composite;

import element.DocElementInterface;
import element.Element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ListElement extends ElementCollection {
    //Cannot add ElementCollections in a Collection? Element instead of DocElementInterface
    private List<DocElementInterface> elements;
    public ListElement(){
        super();
     //   elementList.add(this);
     //   elements = new ArrayList<>();
    }

    @Override
    public void addElement(DocElementInterface element) {
      //  if(element.getClass().isInstance(Element element))
        elementList.add(element);
    }
    @Override
    public void updateElement(DocElementInterface element) {




    }

 /*   @Override
    public Element getElement(int index) {
        return elements.get(index);
    }*/

    @Override
    public void deleteElement(DocElementInterface element) {
        elements.remove(element);
    }

    @Override
    public String render() {
        return elementList.stream()
                .map(DocElementInterface::render)
                .collect(Collectors.joining("\n"));
    }

 /*   @Override
    public Iterator<Element> iterator() {
        return elements.iterator();
    }*/
    @Override
    public String toString(){
        return elementList.stream()
                .map(DocElementInterface::render)
                .collect(Collectors.joining("\n"));
    }
}
