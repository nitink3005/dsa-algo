public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Decorator Pattern ---");
        BasicTextEditor basicTextEditor = new BasicTextEditor();
        basicTextEditor.display();

        TextEditor spellingTextEditor = new SpellingTextEditor(basicTextEditor);
        System.out.println("------Spelling text Editor------");
        spellingTextEditor.display();

        TextEditor grammerTextEditor = new GrammarTextEditor(spellingTextEditor);
        System.out.println("------grammer text editor with spell check------");
        grammerTextEditor.display();

        TextEditor saveFileTextEditor = new AutoSaveTextEditor(grammerTextEditor);
        System.out.println("------save file textEditor with grammer and spell check------");
        saveFileTextEditor.display();

    }
}
