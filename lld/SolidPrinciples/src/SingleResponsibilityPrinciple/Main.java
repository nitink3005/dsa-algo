package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        System.out.println("Single Responsibility Principle");
        CostCalculator c1 = new CostCalculator();
        c1.calculateCost();

        PrintInvoice p1 = new PrintInvoice();
        p1.printInvoice();

        SaveInvoice s1 = new SaveInvoice();
        s1.save();
    }
}