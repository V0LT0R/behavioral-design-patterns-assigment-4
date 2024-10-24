public class CEO extends Approver {
    @Override
    public void handleRequest(ExpenseRequest request) {
        System.out.println("CEO approved the expense of $" + request.getAmount() + " for " + request.getPurpose());
    }
}
