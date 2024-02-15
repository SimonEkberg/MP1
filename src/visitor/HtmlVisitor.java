package visitor;

import element.*;
import element.composite.*;

public class HtmlVisitor implements DocumentVisitor {
    private StringBuilder htmlContent = new StringBuilder();

    @Override
    public void visitDocument(Document document) {
        htmlContent.append("<!DOCTYPE html>\n<html>\n<head>\n<title>")
                .append(document.getTitle())
                .append("</title>\n</head>\n<body>\n");
    }


    @Override
    public void visitHeader(Header header) {
        htmlContent.append("<h1>").append(header.render()).append("</h1>\n");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        htmlContent.append("<p>").append(paragraph.render()).append("</p>\n");
    }

    @Override
    public void visitListElement(ListElement listElement) {
        htmlContent.append("<ul>\n");
        for (DocElementInterface item : listElement) { // Antag att ListElement har getElements
            htmlContent.append("<li>").append(item.render()).append("</li>\n");
        }
        htmlContent.append("</ul>\n");
    }

    public String getHTML() {
        htmlContent.append("</body>\n</html>");
        return htmlContent.toString();
    }


    @Override
    public String getResult() {
        return null;
    }
}
