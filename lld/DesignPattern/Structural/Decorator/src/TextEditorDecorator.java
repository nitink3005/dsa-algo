public abstract class TextEditorDecorator implements TextEditor {
    private TextEditor decoratedTextEditor;
    public TextEditorDecorator(TextEditor textEditor) {
        this.decoratedTextEditor = textEditor;
    }

    public void display() {
        decoratedTextEditor.display();
    }
}
