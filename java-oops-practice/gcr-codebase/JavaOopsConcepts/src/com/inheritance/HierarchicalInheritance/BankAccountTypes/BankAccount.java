package HierarchicalInheritance.BankAccountTypes;

public class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    // method to fetch balance from account
    public double getBalance() {
        return balance;
    }
}
