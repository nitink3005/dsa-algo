public class CreditCard {
    private String cardNumber;
    private String cvv;
    private ValidationStrategy validationStrategy;

    public CreditCard(String cardNumber, String cvv, ValidationStrategy validationStrategy) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.validationStrategy = validationStrategy;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setValidationStrategy(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean isValid() {
        return validationStrategy.isValid(this);
    }
}
