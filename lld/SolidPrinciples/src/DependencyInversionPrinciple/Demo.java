package DependencyInversionPrinciple;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Dependency Inversion Principle");
        Keyboard wiredK = new WiredKeyboard();
        Macbook m2 = new Macbook(wiredK);
        m2.type();
    }
}
