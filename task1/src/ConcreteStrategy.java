// CreditCardPayment.java
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " for cardholder: " + cardHolderName);
    }
}

// PayPalPayment.java
class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for email: " + email);
    }
}

// CryptoPayment.java
class CryptoPayment implements PaymentStrategy {
    private String cryptoWalletAddress;

    public CryptoPayment(String cryptoWalletAddress) {
        this.cryptoWalletAddress = cryptoWalletAddress;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment of $" + amount + " to wallet: " + cryptoWalletAddress);
    }
}
