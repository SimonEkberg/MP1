package element.composite;

import element.DocElementInterface;
import element.ElementText;
import visitor.DocumentVisitor;

import java.util.stream.Collectors;

public class Document extends ElementCollection {

    private ElementText title;

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitDocument(this);
    }

    @Override
    public String render() {
        return title.getText()+"\n"+elementList.stream()
                .map(DocElementInterface::render)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public ListElement addElement(DocElementInterface element) {
        elementList.add(element);
        return null;
    }

    @Override
    public void updateElement(DocElementInterface element) {

    }

    @Override
    public void deleteElement(DocElementInterface element) {
        elementList.remove(element);
    }

    @Override
    public void setListName(String listName) {

    }

    @Override
    public String getListName() {
        return null;
    }

    public String getTitle() {
        return title.getText();
    }

    public void setTitle(String title) {
        this.title = new ElementText(title);
    }

    @Override
    public String toString(){
        return title.getText()+"\n"+elementList.stream()
                .map(DocElementInterface::toString)
                .collect(Collectors.joining("\n"));
    }
}
