public class GrammarTextEditor extends TextEditorDecorator {
    public GrammarTextEditor(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void display() {
        super.display();
        addGrammarCheck();
    }

    public void addGrammarCheck() {
        System.out.println("Doing grammar check.");
    }
}
