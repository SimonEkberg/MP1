package element;

import visitor.DocumentVisitor;

public class Paragraph extends Element{

    private ElementText text;

    public Paragraph(){
        this("");
    }

    public Paragraph(String text) {
        super();
        setElementText(text);
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitParagraph(this);
    }

    @Override
    public String render() {
        return text.getText();
    }

    @Override
    public void setElementText(String text) {
        this.text = new ElementText(text);
    }
}
