package mybank;

public class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    public SavingsAccount(String accountNumber, double openingBalance) {
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
        if (!hasSufficientBalance(amount)) {
            System.out.println("Insufficient balance");
            return;
        }
        debit(amount);
    }

    @Override
    public double calculateInterest() {
        return checkBalance() * INTEREST_RATE / 100;
    }
}
