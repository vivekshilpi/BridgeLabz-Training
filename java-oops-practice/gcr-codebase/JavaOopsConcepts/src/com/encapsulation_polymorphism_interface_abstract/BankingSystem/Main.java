package BankingSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(235134123, "Om Tiwari", 50000, 10);
        CurrentAccount c1 = new CurrentAccount(5353533, "Harshveer Thakur",4444 );

        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(s1);
        bankAccounts.add(c1);

        for(BankAccount bankAccount: bankAccounts){
            bankAccount.getDetails();
            System.out.println();
        }
    }
}