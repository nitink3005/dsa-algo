package OpenClosedPrinciple;

public class SaveToDB implements SavingInvoice {
    @Override
    public void save() {
        System.out.println("Saving invoice to DB");
    }
}
