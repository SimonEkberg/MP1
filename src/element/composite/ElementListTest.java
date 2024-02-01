package element.composite;

/*class ElementListTest {

    private Optional<DocElementInterface> elementList;
    private ElementFactory factory;

    @BeforeEach
    void setUp() {
     //   elementList = new ElementList();
        factory = new ElementFactory();
        elementList = factory.createDocElement(ElementType.LIST);
    }

    @Test
    void testAddAndRetrieveElement() {
        Optional<DocElementInterface> optionalElement1 = factory.createDocElement(ElementType.PARAGRAPH);
        Optional<DocElementInterface> optionalElement2 = factory.createDocElement(ElementType.HEADER);

        optionalElement1.ifPresent(elementList::addElement);
        optionalElement2.ifPresent(elementList::addElement);

        optionalElement1.ifPresent(element1 -> assertSame(element1, elementList.getElement(0)));
        optionalElement2.ifPresent(element2 -> assertSame(element2, elementList.getElement(1)));
    }

    @Test
    void testRemoveElement() {
        Optional<DocElementInterface> optionalElement1 = factory.createDocElement(ElementType.PARAGRAPH);
        Optional<DocElementInterface> optionalElement2 = factory.createDocElement(ElementType.HEADER);

        optionalElement1.ifPresent(elementList::addElement);
        optionalElement2.ifPresent(elementList::addElement);
        optionalElement1.ifPresent(elementList::deleteElement);

        optionalElement2.ifPresent(element2 -> assertSame(element2, elementList.getElement(0)));
    }

    @Test
    void testGetText() {
        Optional<DocElementInterface> optionalElement1 = factory.createDocElement(ElementType.PARAGRAPH);
        Optional<DocElementInterface> optionalElement2 = factory.createDocElement(ElementType.HEADER);

        optionalElement1.ifPresent(element -> {
            element.setText("First Element");
            elementList.addElement(element);
        });

        optionalElement2.ifPresent(element -> {
            element.setText("Second Element");
            elementList.addElement(element);
        });

        String expectedText = "First Element\nSecond Element";
        assertEquals(expectedText, elementList.getText());
    }
}
*/