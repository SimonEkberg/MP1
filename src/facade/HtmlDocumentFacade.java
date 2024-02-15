/*package facade;

import element.DocElementInterface;
import element.Header;
import element.Paragraph;
import element.composite.Document;
import element.composite.ElementCollection;
import element.composite.ListElement;

public class HtmlDocumentFacade implements DocumentFacadeInterface {

    @Override
    public String render(Document document) {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<!DOCTYPE html>\n<html>\n<head>\n<title>").append(document.getTitle() + "</title>\n</head>\n<body>\n");

        for (DocElementInterface element : document) { // Assuming Document provides getElements()
            htmlBuilder.append(convertToHTML(element)).append("\n");
        }

        htmlBuilder.append("</body>\n</html>");

        return htmlBuilder.toString();
    }

    private String convertToHTML(DocElementInterface element) {
        if (element instanceof Header) {
            Header header = (Header) element;
            return "<h1>" + header.render() + "</h1>"; // Assuming Header provides getContent()
        } else if (element instanceof Paragraph) {
            Paragraph paragraph = (Paragraph) element;
            return "<p>" + paragraph.render() + "</p>"; // Assuming Paragraph provides getContent()
        } else if (element instanceof ListElement) {
            ListElement listElement = (ListElement) element;
            StringBuilder htmlList = new StringBuilder("<ul>\n");
            for (DocElementInterface item : listElement) { // Assuming ListElement can iterate over its items
                // Assuming each item can directly convert itself to a string suitable for HTML
                String renderedItem = item.render();
                htmlList.append("<li>").append(renderedItem).append("</li>\n");
            }
            htmlList.append("</ul>");
            return htmlList.toString();
        }
        return "";
    }
}*/

package facade;

import element.DocElementInterface;
import element.composite.Document;
import visitor.HtmlVisitor;

public class HtmlDocumentFacade implements DocumentFacadeInterface {

    @Override
    public String render(Document document) {
        HtmlVisitor visitor = new HtmlVisitor();

        // Starta besöket med dokumentet
        visitor.visitDocument(document);

        // Låt visitorn besöka varje element i dokumentet
        for (DocElementInterface element : document) {
            element.accept(visitor);
        }

        // Avsluta HTML-dokumentet och hämta resultatet
        return visitor.getHTML();
    }
}

