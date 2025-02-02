package AbstractFactory;

public class AbstractFactoryPattern {
    public static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("win")) {
            factory = new WindowFactory();
        } else {
            factory = new MacFactory();
        }
        app = new Application(factory);
        return app;
    }
}
