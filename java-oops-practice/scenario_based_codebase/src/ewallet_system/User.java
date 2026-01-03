package ewallet_system;

public class User {

    private int userId;
    private String name;
    private Wallet wallet;

    public User(int userId, String name, Wallet wallet, boolean referralBonus) {
        this.userId = userId;
        this.name = name;
        this.wallet = wallet;

        if (referralBonus) {
            wallet.credit(500); // referral bonus
        }
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void loadMoney(double amount) {
        wallet.credit(amount);
        System.out.println("Money loaded: " + amount);
    }

    public void showBalance() {
        System.out.println("Balance: " + wallet.getBalance());
    }
}

