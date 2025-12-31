package HierarchicalInheritance.BankAccountTypes;

// Create a FixedDepositAccount class that extends BankAccount class
public class FixedDepositAccount extends BankAccount{
    private int lockInPeriod;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    public void displayAccountType(){
        System.out.println("This is a Fixed Deposit account");
    }
}
