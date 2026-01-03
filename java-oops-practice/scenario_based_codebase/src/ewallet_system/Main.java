package ewallet_system;

public class Main {
    public static void main(String[] args) {

        Wallet personalWallet = new PersonalWallet(10000);
        Wallet businessWallet = new BusinessWallet(50000);

        User user1 = new User(1, "Sanya", personalWallet, true);
        User user2 = new User(2, "Rahul", businessWallet, false);

        user1.showBalance();
        user2.showBalance();

        user1.getWallet().transferTo(user2, 3000);
        System.out.println("-------------------");

        user2.getWallet().transferTo(user1, 10000);
        System.out.println("-------------------");

        user1.showBalance();
        user2.showBalance();

        System.out.println("User1 Transactions:");
        user1.getWallet().showTransactionHistory();
    }
}
