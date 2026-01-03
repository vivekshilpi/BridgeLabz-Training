package ewallet_system;

public class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 50000;

    public PersonalWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double getTransferLimit() {
        return TRANSFER_LIMIT;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > getTransferLimit()) {
            System.out.println("Transfer limit exceeded for Personal Wallet");
            return;
        }

        if (getBalance() < amount) {
            System.out.println("Insufficient balance");
            return;
        }

        debit(amount);
        receiver.getWallet().credit(amount);
        System.out.println("Transfer successful (Personal Wallet)");
    }
}
