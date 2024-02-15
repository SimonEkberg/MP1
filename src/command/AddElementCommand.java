package command;

import element.DocElementInterface;
import element.composite.Document;

public class AddElementCommand implements Command {
    private Document document;
    private DocElementInterface element;

    public AddElementCommand(Document document, DocElementInterface element) {
        this.document = document;
        this.element = element;
    }

    @Override
    public void execute() {
        document.addElement(element);
    }

    @Override
    public void undo() {
        document.deleteElement(element);
    }
}
