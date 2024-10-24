public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("### Scenario 1: Pay and ship the order ###");
        order.payOrder();  // Pay the order, transitioning from New to Paid
        order.shipOrder(); // Ship the order, transitioning from Paid to Shipped
        order.deliverOrder(); // Deliver the order, transitioning from Shipped to Delivered

        System.out.println("\n### Scenario 2: Try cancelling a delivered order ###");
        order.cancelOrder(); // Shouldn't be allowed, as it's already delivered

        System.out.println("\n### Scenario 3: Cancel the order before payment ###");
        Order newOrder = new Order();
        newOrder.cancelOrder(); // Cancel the order, transitioning from New to Cancelled

        System.out.println("\n### Scenario 4: Try paying for a cancelled order ###");
        newOrder.payOrder(); // Shouldn't be allowed, as it's cancelled
    }
}
