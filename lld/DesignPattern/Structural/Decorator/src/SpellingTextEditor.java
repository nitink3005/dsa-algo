public class SpellingTextEditor extends  TextEditorDecorator {
    public SpellingTextEditor(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void display() {
        super.display();
        spellingCheck();
    }

    public void spellingCheck() {
        System.out.println("Doing spelling check.");
    }
}
