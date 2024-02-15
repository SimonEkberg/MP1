package visitor;

import element.DocElementInterface;
import element.Header;
import element.Paragraph;
import element.composite.Document;
import element.composite.ListElement;

public class LatexVisitor implements DocumentVisitor{

    private StringBuilder latexContent = new StringBuilder();

    @Override
    public void visitHeader(Header header) {
        latexContent.append("\\section{").append(header.render()).append("}\n");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        latexContent.append(paragraph.render()).append("\n\n");
    }

    @Override
    public void visitListElement(ListElement listElement) {
        latexContent.append("\\begin{itemize}\n");
        for (DocElementInterface item : listElement) {
            latexContent.append("\\item ").append(item.render()).append("\n");
        }
        latexContent.append("\\end{itemize}\n");
    }

    @Override
    public void visitDocument(Document document) {
        latexContent.append("\\documentclass{article}\n")
                .append("\\title{").append(document.getTitle()).append("}\n")
                .append("\\begin{document}\n")
                .append("\\maketitle\n");
    }

    @Override
    public String getResult() {
        latexContent.append("\\end{document}");
        return latexContent.toString();
    }
}
