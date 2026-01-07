package loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(double principal, int tenure) {
        super(principal, 9.0, tenure);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        boolean eligible =
                applicant.getCreditScore() >= 650 &&
                applicant.getIncome() >= 25000;

        setApprovalStatus(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return baseEMIFormula() * 1.02; // processing factor
    }
}

