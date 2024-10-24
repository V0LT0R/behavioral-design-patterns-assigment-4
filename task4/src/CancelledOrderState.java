public class CancelledOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Cannot pay for a cancelled order.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship a cancelled order.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver a cancelled order.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}
