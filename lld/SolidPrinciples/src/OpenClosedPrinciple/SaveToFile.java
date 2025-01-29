package OpenClosedPrinciple;

public class SaveToFile implements SavingInvoice {
    @Override
    public void save() {
        System.out.println("Saved invoice to File");
    }
}
