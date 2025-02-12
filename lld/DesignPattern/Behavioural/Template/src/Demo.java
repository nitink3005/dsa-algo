public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Template ----");
        OrderTemplate inStoreOrder = new InStoreOrder();
        inStoreOrder.createOrder();

        System.out.println("-------------------------");

        OrderTemplate onlineOrder = new OnlineOrder();
        onlineOrder.createOrder();
    }
}
