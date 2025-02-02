package AbstractFactory;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern");
        Application app = AbstractFactoryPattern.configureApplication();
        app.paint();
    }
}
