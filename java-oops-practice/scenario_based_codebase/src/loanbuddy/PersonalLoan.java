package loanbuddy;

public class PersonalLoan extends LoanApplication {

    public PersonalLoan(double principal, int tenure) {
        super(principal, 12.5, tenure);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        boolean eligible =
                applicant.getCreditScore() >= 750 &&
                applicant.getIncome() >= 30000;

        setApprovalStatus(eligible);
        return eligible;
    }

    @Override
    public double calculateEMI() {
        return baseEMIFormula() * 1.05; // higher risk
    }
}

