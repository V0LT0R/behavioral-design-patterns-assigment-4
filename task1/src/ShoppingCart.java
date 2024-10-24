public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Method to set/change the payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to process payment with the selected strategy
    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method.");
        } else {
            paymentStrategy.processPayment(amount);
        }
    }
}
