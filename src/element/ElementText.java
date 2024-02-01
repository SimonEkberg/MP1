package element;

 //Possible to add form-checks etc. here.
public class ElementText {
    private String text;

    public ElementText(String text){
        setText(text);
    }

    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }



}


