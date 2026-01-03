package mybank;

public class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.5;
    private static final double OVERDRAFT_LIMIT = 10000;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        credit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return;
        }

        if (checkBalance() + OVERDRAFT_LIMIT < amount) {
            System.out.println("Overdraft limit exceeded");
            return;
        }

        debit(amount);
    }

    @Override
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;
    }
}
