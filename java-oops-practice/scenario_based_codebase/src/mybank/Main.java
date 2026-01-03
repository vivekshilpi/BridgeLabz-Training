package mybank;

public class Main {
    public static void main(String[] args) {

        Account savings = new SavingsAccount("SB101", 50000);
        Account current = new CurrentAccount("CA201", 20000);

        savings.deposit(5000);
        savings.withdraw(2000);

        current.withdraw(25000); // overdraft allowed

        System.out.println("Savings Balance : " + savings.checkBalance());
        System.out.println("Savings Interest : " + savings.calculateInterest());

        System.out.println("Current Balance : " + current.checkBalance());
        System.out.println("Current Interest : " + current.calculateInterest());
    }
}
