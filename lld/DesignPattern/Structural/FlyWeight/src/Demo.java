public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Flyweight Pattern ---");
        TextEditor textEditor = new TextEditor();
        textEditor.addCharacters('H', "Arial-12-Black");
        textEditor.addCharacters('E', "Arial-12-Black");
        textEditor.addCharacters('L', "Arial-12-Black");
        textEditor.addCharacters('L', "Arial-12-Black");
        textEditor.addCharacters('O', "Arial-12-Black");

        textEditor.addCharacters('W', "Arial-13-Red");
        textEditor.addCharacters('O', "Arial-13-Red");
        textEditor.addCharacters('R', "Arial-13-Red");
        textEditor.addCharacters('L', "Arial-13-Red");
        textEditor.addCharacters('D', "Arial-13-Red");

        textEditor.display();
        textEditor.memoryUsage();
    }
}
