package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.createInstance("foo");
        Singleton s2 = Singleton.createInstance("bar");
        s1.printValue();
        s2.printValue();
    }
}