package DependencyInversionPrinciple;

public class Macbook {
    private Keyboard keyboard;

    public Macbook(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void type() {
        keyboard.type();
    }
}
