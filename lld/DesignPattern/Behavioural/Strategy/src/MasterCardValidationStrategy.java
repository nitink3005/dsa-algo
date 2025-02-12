public class MasterCardValidationStrategy extends  ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        if(creditCard.getCardNumber().startsWith("4")) {
            System.out.println("Card " + creditCard.getCardNumber() + " with MasterCard Strategy is valid!!");
            return true;
        }
        System.out.println("Card " + creditCard.getCardNumber() + " with MasterCard Strategy is NOT valid!!");
        return false;
    }
}
