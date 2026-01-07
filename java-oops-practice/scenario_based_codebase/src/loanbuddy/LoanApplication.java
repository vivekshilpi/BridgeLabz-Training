package loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected double principal;
    protected double interestRate; // annual
    protected int tenure;          // months

    private boolean approved;      // 🔒 internal state

    public LoanApplication(double principal, double interestRate, int tenure) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    protected void setApprovalStatus(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    protected double baseEMIFormula() {
        double r = interestRate / (12 * 100);
        int n = tenure;
        return (principal * r * Math.pow(1 + r, n)) /
               (Math.pow(1 + r, n) - 1);
    }
}

