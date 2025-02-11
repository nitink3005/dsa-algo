public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Observer ---");
        Subject iphone = new ConcreteSubject();
        Observer user1 = new ConcreteObserver("user1");
        Observer user2= new ConcreteObserver("user2");

        iphone.addObserver(user1);
        iphone.addObserver(user2);
        iphone.notifyObservers();
    }
}
