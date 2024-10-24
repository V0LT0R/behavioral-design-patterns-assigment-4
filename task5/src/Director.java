public class Director extends Approver {
    private static final double APPROVAL_LIMIT = 20000;

    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() <= APPROVAL_LIMIT) {
            System.out.println("Director approved the expense of $" + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.handleRequest(request);
        }
    }
}
