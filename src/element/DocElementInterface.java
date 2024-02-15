package element;

import visitor.DocumentVisitor;

public interface DocElementInterface {

    void accept(DocumentVisitor visitor);
    String render();
}