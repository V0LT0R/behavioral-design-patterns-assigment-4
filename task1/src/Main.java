public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456", "John Doe");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100.50);

        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com");
        cart.setPaymentStrategy(payPalPayment);
        cart.checkout(200.75);

        PaymentStrategy cryptoPayment = new CryptoPayment("1A2B3C4D5E6F");
        cart.setPaymentStrategy(cryptoPayment);
        cart.checkout(300.00);
    }
}
