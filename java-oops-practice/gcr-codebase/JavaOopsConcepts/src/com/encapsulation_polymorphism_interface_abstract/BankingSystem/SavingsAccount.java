package BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {
    private int interestRate;

    @Override
    public double calculateInterest() {
        return getBalance()*interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Successfully applied for loan");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 4;
    }

    public SavingsAccount(long accountNumber, String accountHolderName, int balance, int interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("loan eligibility : "+calculateLoanEligibility());
        System.out.println("total interest : "+calculateInterest());
    }
}
