public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Proxy Pattern ----");
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
            internet.connectTo("facebook.com");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
