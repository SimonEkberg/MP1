package element.composite;

import element.DocElementInterface;
import element.ElementText;
import visitor.DocumentVisitor;

import java.util.stream.Collectors;

public class ListElement extends ElementCollection {

    ElementText listName;
    public ListElement(){
        super();
    }

    public void setListName(String listName){
        this.listName = new ElementText(listName);
    }
    @Override
    public String getListName(){
        return listNameIsEmpty();
    }
    @Override
    public ListElement addElement(DocElementInterface element) {
        elementList.add(element);
        return this;
    }
    @Override
    public void updateElement(DocElementInterface element) {
    }


    @Override
    public void deleteElement(DocElementInterface element) {

        elementList.remove(element);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitListElement(this);
    }

    @Override
    public String render() {
        return listNameIsEmpty() +elementList.stream()
                .map(DocElementInterface::render)
                .collect(Collectors.joining("\n"));
    }

    private String listNameIsEmpty() {
        if(this.listName == null)
            return "";

        return this.listName.getText()+"\n";

    }

    @Override
    public String toString(){
        String s = "(List: ";
        for(DocElementInterface f: elementList)
            s += f.toString();
        s += ") ";
        return s;
    }
}
