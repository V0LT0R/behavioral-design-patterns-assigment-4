public class NewOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order is paid. Moving to Paid state.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship the order. It has not been paid yet.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver the order. It has not been shipped.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is cancelled.");
        order.setState(new CancelledOrderState());
    }
}
