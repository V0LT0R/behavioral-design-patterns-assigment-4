public class ApprovalChain {
    private Approver chain;

    public ApprovalChain() {
        // Set up the chain of responsibility
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        chain = teamLead; // The chain starts with the team lead
    }

    public void processRequest(ExpenseRequest request) {
        chain.handleRequest(request);
    }
}
