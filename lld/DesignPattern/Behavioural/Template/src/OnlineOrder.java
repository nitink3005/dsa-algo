public class OnlineOrder extends  OrderTemplate {
    @Override
    public void checkout() {
        System.out.println("Added items to online cart");
    }

    @Override
    public void doPayement() {
        System.out.println("Paying through net banking");
    }

    @Override
    public void printInvoice() {
        System.out.println("Invoice Pdf, ready for download");
    }

    @Override
    public void deliver() {
        System.out.println("Item out for delivery within 2-3 days");
    }
}
