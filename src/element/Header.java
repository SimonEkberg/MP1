package element;

import visitor.DocumentVisitor;

public class Header extends Element{

    private ElementText text;

   public Header(){
     super();
   }
  public Header(String text){
    super();
    setElementText(text);
  }
    @Override
    public void setElementText(String text) {
        this.text = new ElementText(text);
    }

    @Override
    public String render() {
        return text.getText();
    }

    @Override
    public String toString(){
        return "(Header: "+text.getText()+")";
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visitHeader(this);
    }
}
