package factory;

import element.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*class ElementFactoryTest {

    ElementFactory factory = new ElementFactory();

    @Test
    void createParagraph() {
        DocElementInterface element = factory.createDocElement(ElementType.PARAGRAPH);
        assertTrue(element != null);
        assertTrue(element instanceof Paragraph);

        Element paragraph;
        paragraph = factory.createDocElement(ElementType.PARAGRAPH);
        paragraph.setElementText("This is a paragraph");
        assertEquals("This is a paragraph", paragraph.render());
    }

    @Test
    void createHeading() {
        DocElementInterface element = factory.createDocElement(ElementType.HEADER);
        assertTrue(element != null);
        assertTrue(element instanceof Header);

        Element heading;
        heading = factory.createDocElement(ElementType.HEADER);
        heading.setElementText("This is a header");
        assertEquals("This is a header", heading.render());
    }

    @Test
    void createInvalidElement() {
        DocElementInterface element = factory.createDocElement(null);
        assertFalse(element != null);
    }
}*/
