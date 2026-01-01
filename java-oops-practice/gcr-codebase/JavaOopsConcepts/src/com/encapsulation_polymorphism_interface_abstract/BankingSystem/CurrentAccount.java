package BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable{
    public CurrentAccount(long accountNumber, String accountHolderName, int balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance()*0.05;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Applied for loan");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance()*5;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Loan eligiblity: "+calculateLoanEligibility());
        System.out.println("Total interest : "+calculateInterest());
    }
}