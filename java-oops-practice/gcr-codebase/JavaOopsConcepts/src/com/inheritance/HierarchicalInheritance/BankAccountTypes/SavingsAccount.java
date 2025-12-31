package HierarchicalInheritance.BankAccountTypes;

// Create a SavingsAccount class that extends BankAccount class
public class SavingsAccount extends BankAccount{
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType(){
        System.out.println("This is a saving account");
    }

    // make a method to applyInterest
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}
