public class InStoreOrder extends OrderTemplate {
    @Override
    public void checkout() {
        System.out.println("Added item to cart");
    }

    @Override
    public void doPayement() {
        System.out.println("Payed Amt in Cash");
    }

    @Override
    public void printInvoice() {
        System.out.println("Invoice handed to customer");
    }

    @Override
    public void deliver() {
        System.out.println("Delivery done");
    }
}
