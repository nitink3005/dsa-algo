public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Strategy Pattern ---");
        ValidationStrategy amex = new AmexValidationStrategy();
        ValidationStrategy masterCard = new MasterCardValidationStrategy();

        CreditCard creditCard = new CreditCard("349u4393848", "004", amex);
        creditCard.isValid();

        creditCard.setValidationStrategy(masterCard);
        creditCard.isValid();
    }
}
