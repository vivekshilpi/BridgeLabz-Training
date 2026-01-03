package mybank;

public abstract class Account implements ITransaction {

    protected String accountNumber;
    private double balance;   // encapsulated

    // constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // constructor with opening balance
    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    // controlled access
    protected void credit(double amount) {
        balance += amount;
    }

    protected boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    protected void debit(double amount) {
        balance -= amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    // polymorphic behavior
    public abstract double calculateInterest();
}
