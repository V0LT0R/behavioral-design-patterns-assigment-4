public class Main {
    public static void main(String[] args) {
        ApprovalChain approvalChain = new ApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(500, "Team outing");
        ExpenseRequest request2 = new ExpenseRequest(2000, "New office chairs");
        ExpenseRequest request3 = new ExpenseRequest(12000, "New server equipment");
        ExpenseRequest request4 = new ExpenseRequest(50000, "Office renovation");

        System.out.println("Processing expense requests:\n");

        approvalChain.processRequest(request1);  // Handled by Team Lead
        approvalChain.processRequest(request2);  // Handled by Manager
        approvalChain.processRequest(request3);  // Handled by Director
        approvalChain.processRequest(request4);  // Handled by CEO
    }
}
