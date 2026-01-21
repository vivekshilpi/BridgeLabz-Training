package collections.examples.bankingsystem;

import java.util.*;

public class BankingSystem {

    private HashMap<Integer, Double> accounts = new HashMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();
    private Scanner sc = new Scanner(System.in);

    public void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        accounts.put(accNo, balance);
        System.out.println("Account created successfully!\n");
    }

    public void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        if (accounts.containsKey(accNo)) {
            System.out.print("Enter Amount to Deposit: ");
            double amount = sc.nextDouble();
            accounts.put(accNo, accounts.get(accNo) + amount);
            System.out.println("Deposit successful!\n");
        } else {
            System.out.println("Account not found!\n");
        }
    }

    public void requestWithdrawal() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        if (accounts.containsKey(accNo)) {
            withdrawalQueue.add(accNo);
            System.out.println("Withdrawal request added to queue.\n");
        } else {
            System.out.println("Account not found!\n");
        }
    }

    public void processWithdrawal() {
        if (withdrawalQueue.isEmpty()) {
            System.out.println("No pending withdrawal requests.\n");
            return;
        }

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        int accNo = withdrawalQueue.poll();

        if (accounts.get(accNo) >= amount) {
            accounts.put(accNo, accounts.get(accNo) - amount);
            System.out.println("₹" + amount + " withdrawn from Account " + accNo + "\n");
        } else {
            System.out.println("Insufficient balance in Account " + accNo + "\n");
        }
    }

    public void displayAccounts() {
        System.out.println("\n--- All Accounts ---");
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            System.out.println("Account: " + entry.getKey() + " | Balance: ₹" + entry.getValue());
        }
        System.out.println();
    }

    public void displaySortedByBalance() {
        TreeMap<Double, Integer> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\n--- Accounts Sorted by Balance ---");
        for (Map.Entry<Double, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Balance: ₹" + entry.getKey() + " | Account: " + entry.getValue());
        }
        System.out.println();
    }

    public void menu() {
        int choice;

        do {
            System.out.println("===== Banking System Menu =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Request Withdrawal");
            System.out.println("4. Process Withdrawal");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Display Accounts Sorted by Balance");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    requestWithdrawal();
                    break;
                case 4:
                    processWithdrawal();
                    break;
                case 5:
                    displayAccounts();
                    break;
                case 6:
                    displaySortedByBalance();
                    break;
                case 7:
                    System.out.println("Thank you for using the Banking System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        } while (choice != 7);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.menu();
    }
}
