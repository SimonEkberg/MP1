import command.AddElementCommand;
import command.CommandManager;
import element.Header;
import element.Paragraph;
import element.composite.Document;


public class CommandMain {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        Document document = new Document();

        // Sätt titel på dokumentet
        document.setTitle("Mitt Dokument");

        // Skapa ett paragraph-element
        Paragraph paragraph = new Paragraph("Detta är en paragraf.");

        // Skapa ett header-element
        Header header = new Header("Detta är en rubrik.");

        // Skapa och utför kommandon för att lägga till element
        AddElementCommand addParagraphCommand = new AddElementCommand(document, paragraph);
        commandManager.executeCommand(addParagraphCommand);


        System.out.println(document.render());
        System.out.println("******************************");

        AddElementCommand addHeaderCommand = new AddElementCommand(document, header);
        commandManager.executeCommand(addHeaderCommand);

        System.out.println(document.render());
        System.out.println("******************************");


        // Om du behöver ångra tillägget
        commandManager.undo();

        System.out.println(document.render());
        System.out.println("******************************");

        // Om du vill återställa ångringen
        commandManager.redo();

        System.out.println(document.render());
        System.out.println("******************************");
    }
}
