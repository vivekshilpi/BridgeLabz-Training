package com.lambdaexpressionscenario;
import java.util.*;

public class BankingLambda {

    static class Account {
        String name;
        double balance;
        double interestRate;

        public Account(String name, double balance, double interestRate) {
            this.name = name;
            this.balance = balance;
            this.interestRate = interestRate;
        }

        @Override
        public String toString() {
            return name + " Balance:" + balance + " Interest:" + interestRate;
        }
    }

    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
                new Account("Rashi", 1000, 5),
                new Account("Sahil", 500, 4),
                new Account("Ankit", 1500, 6)
        );

        // 1. Check minimum balance (min 500)
        System.out.println("----- Minimum Balance Check -----");
        accounts.forEach(a -> System.out.println(a.name + ": " + (a.balance >= 500 ? "OK" : "Below Minimum")));

        // 2. Calculate simple interest (SI = P*R/100)
        System.out.println("\n----- Simple Interest -----");
        accounts.forEach(a -> System.out.println(a.name + ": " + (a.balance * a.interestRate / 100)));

        // 3. Validate withdrawal amount (< balance)
        System.out.println("\n----- Withdrawal Validation -----");
        double withdraw = 600;
        accounts.forEach(a -> System.out.println(a.name + ": " + (withdraw <= a.balance ? "Allowed" : "Not Allowed")));

        // 4. Print account details
        System.out.println("\n----- Account Details -----");
        accounts.forEach(System.out::println);

        // 5. Compare two account balances
        System.out.println("\n----- Compare Two Accounts -----");
        Account a1 = accounts.get(0);
        Account a2 = accounts.get(1);
        Comparator<Account> balanceComp = (acc1, acc2) -> Double.compare(acc1.balance, acc2.balance);
        System.out.println("Comparison: " + balanceComp.compare(a1, a2));
    }
}
