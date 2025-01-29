package DependencyInversionPrinciple;

public class WirelessKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Wireless Keyboard - typing....");
    }
}
