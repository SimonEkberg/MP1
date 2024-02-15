package element;

public class ElementText {
    private String text;
    public ElementText(String text) {
        setText(text);
    }
    public String getText(){
        return (text != null)? text : "*No text";
    }
    public void setText(String text){
        this.text = text;
    }
}


