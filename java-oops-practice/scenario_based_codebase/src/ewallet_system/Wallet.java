package ewallet_system;

import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferrable {

    private double balance;
    protected List<Transaction> transactions;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
        transactions.add(new Transaction("CREDIT", amount));
    }

    protected void debit(double amount) {
        balance -= amount;
        transactions.add(new Transaction("DEBIT", amount));
    }

    public void showTransactionHistory() {
        for (Transaction t : transactions) {
            t.displayTransaction();
        }
    }

    public abstract double getTransferLimit();
}
