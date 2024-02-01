package element;

public class Paragraph extends Element{

    private ElementText text;

    @Override
    public String render() {
        return text.getText();
    }

    @Override
    public void setElementText(String text) {
        this.text = new ElementText(text);
    }
}
