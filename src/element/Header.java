package element;

public class Header extends Element{

  //  private String text;
    private ElementText text;

   public Header(){
     super();
   }
  public Header(ElementText text){
    super();
    this.text = text;
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
        return text.getText();
    }
}
