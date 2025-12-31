package HierarchicalInheritance.BankAccountTypes;

// Create a CheckingAccount class that extends BankAccount class
public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void displayAccountType(){
        System.out.println("This is a Checking account");
    }

    // Override the withdraw method from the BankAccount class
    @Override
    public void withdraw(double amount) {
        if (amount <= (getBalance() + overdraftLimit)) {
            super.withdraw(amount);
        }
    }
}
