package AbstractFactory;

public class WindowsCheckbox implements  Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering Checkbox in Windows style");
    }
}
