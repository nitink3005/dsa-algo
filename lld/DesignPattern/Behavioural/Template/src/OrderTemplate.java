public abstract class OrderTemplate {
    public abstract  void checkout();
    public abstract  void doPayement();
    public abstract  void printInvoice();
    public abstract  void deliver();

    public final void createOrder() {
        checkout();
        doPayement();
        printInvoice();
        deliver();
    }
}
