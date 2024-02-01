package builder;

import element.DocElementInterface;

public abstract class Builder {
    abstract void buildHeader(DocElementInterface element);
    abstract void buildParagraph(DocElementInterface element);
    abstract void buildList(DocElementInterface element);
}
