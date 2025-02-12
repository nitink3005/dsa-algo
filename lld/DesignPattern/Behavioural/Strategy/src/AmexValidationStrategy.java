public class AmexValidationStrategy extends  ValidationStrategy {
    @Override
    public boolean isValid(CreditCard creditCard) {
        if(creditCard.getCardNumber().startsWith("3")) {
            System.out.println("Card " + creditCard.getCardNumber() + " with Amex Strategy is valid!!");
            return true;
        }
        System.out.println("Card " + creditCard.getCardNumber() + " with Amex Strategy is NOT valid!!");
        return false;
    }
}
