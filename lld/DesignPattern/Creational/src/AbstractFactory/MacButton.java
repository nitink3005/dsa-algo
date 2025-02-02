package AbstractFactory;

public class MacButton implements  Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac Button in Mac Style");
    }
}
