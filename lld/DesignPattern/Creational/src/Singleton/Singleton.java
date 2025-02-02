package Singleton;

public class Singleton {
    private static Singleton instance;
    private String value;

    //Constructor of the class is made private
    private Singleton(String value) {
        this.value = value;
    }

    public synchronized static Singleton createInstance(String value) {
        if(instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }

    public void printValue() {
        System.out.println("Singleton value is: "+value);
    }
}
