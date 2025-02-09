public class AutoSaveTextEditor extends  TextEditorDecorator {
    public AutoSaveTextEditor(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void display() {
        super.display();
        saveFile();
    }

    public void saveFile() {
        System.out.println("Saving file.");
    }
}
