package com.optionalclassscenario;
import java.util.*;

public class OptionalBanking {

    static class Account {
        String name;
        Double balance;
        String nominee;
        String loanDetails;
        String transactionRef;
        String creditCard;

        public Account(String name, Double balance, String nominee, String loanDetails, String transactionRef, String creditCard) {
            this.name = name;
            this.balance = balance;
            this.nominee = nominee;
            this.loanDetails = loanDetails;
            this.transactionRef = transactionRef;
            this.creditCard = creditCard;
        }
    }

    public static void main(String[] args) {
        Account acc1 = new Account("Rashi", null, null, null, null, null);
        Account acc2 = new Account("Sahil", 1500.0, "Rashi", "Home Loan", "TX12345", "CC456");

        // 1. Handle optional nominee
        System.out.println("----- Nominee -----");
        System.out.println(Optional.ofNullable(acc1.nominee).orElse("No Nominee"));
        System.out.println(Optional.ofNullable(acc2.nominee).orElse("No Nominee"));

        // 2. Fetch loan details if available
        System.out.println("\n----- Loan Details -----");
        System.out.println(Optional.ofNullable(acc1.loanDetails).orElse("No Loan"));
        System.out.println(Optional.ofNullable(acc2.loanDetails).orElse("No Loan"));

        // 3. If balance is null, return minimum balance
        System.out.println("\n----- Balance -----");
        System.out.println(Optional.ofNullable(acc1.balance).orElse(500.0));
        System.out.println(Optional.ofNullable(acc2.balance).orElse(500.0));

        // 4. Fetch transaction ref safely
        System.out.println("\n----- Transaction Ref -----");
        System.out.println(Optional.ofNullable(acc1.transactionRef).orElse("No Transaction"));
        System.out.println(Optional.ofNullable(acc2.transactionRef).orElse("No Transaction"));

        // 5. Display credit card details only if present
        System.out.println("\n----- Credit Card -----");
        Optional.ofNullable(acc1.creditCard).ifPresentOrElse(System.out::println, () -> System.out.println("No Credit Card"));
        Optional.ofNullable(acc2.creditCard).ifPresentOrElse(System.out::println, () -> System.out.println("No Credit Card"));
    }
}
