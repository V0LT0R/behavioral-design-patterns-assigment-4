public class PaidOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order is shipped. Moving to Shipped state.");
        order.setState(new ShippedOrderState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver the order. It has not been shipped yet.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled.");
        order.setState(new CancelledOrderState());
    }
}
