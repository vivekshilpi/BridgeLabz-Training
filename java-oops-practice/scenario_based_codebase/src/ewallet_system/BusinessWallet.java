package ewallet_system;

public class BusinessWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 200000;
    private static final double TAX_PERCENT = 2;

    public BusinessWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public double getTransferLimit() {
        return TRANSFER_LIMIT;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > getTransferLimit()) {
            System.out.println("Transfer limit exceeded for Business Wallet");
            return;
        }

        double tax = (amount * TAX_PERCENT) / 100;
        double totalDeduction = amount + tax;

        if (getBalance() < totalDeduction) {
            System.out.println("Insufficient balance (including tax)");
            return;
        }

        debit(totalDeduction);
        receiver.getWallet().credit(amount);

        System.out.println("Transfer successful (Business Wallet)");
        System.out.println("Tax deducted: " + tax);
    }
}
