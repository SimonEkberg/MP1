package facade;

import element.composite.Document;

import java.util.Iterator;
import java.util.List;

public interface DocumentFacadeInterface {
  //  void addHeader(String header);
 //   void addParagraph(String paragraph);
 //   void addList(List<String> items);
    String render(Document document);

  //  String render();
 //   String create(Document document);
}
