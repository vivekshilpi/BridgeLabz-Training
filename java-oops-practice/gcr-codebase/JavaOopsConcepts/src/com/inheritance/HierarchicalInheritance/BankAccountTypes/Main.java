package HierarchicalInheritance.BankAccountTypes;

public class Main {
    public static void main(String[] args) {

        // Create object of SavingsAccount class
        SavingsAccount savings = new SavingsAccount("SA001", 1000, 5.5);
        // Call method from SavingsAccount class
        savings.applyInterest();
        System.out.println("Savings Balance: " + savings.getBalance());
        savings.displayAccountType();

        System.out.println("\n-------------------\n");

    }
}
