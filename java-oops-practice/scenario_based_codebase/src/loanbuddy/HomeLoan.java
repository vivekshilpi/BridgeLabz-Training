package loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(double principal, int tenure) {
        super(principal, 7.5, tenure); // lower interest
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        boolean eligible =
                applicant.getCreditScore() >= 700 &&
                applicant.getIncome() >= 40000;

        setApprovalStatus(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return baseEMIFormula();
    }
}

