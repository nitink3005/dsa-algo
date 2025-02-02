package AbstractFactory;

public class MacCheckbox implements  Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering Checkbox in Mac Style");
    }
}
