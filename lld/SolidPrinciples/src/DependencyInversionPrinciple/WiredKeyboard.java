package DependencyInversionPrinciple;

public class WiredKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("WiredKeyboard typing...");
    }
}
