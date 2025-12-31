package com.objectmodelling.assistedProblems;

import java.util.ArrayList;
//BankAccount class
class BankAccount {
 private String accountNumber;
 private double balance;

 // Constructor
 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Getters
 public String getAccountNumber() {
     return accountNumber;
 }

 public double getBalance() {
     return balance;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount + " to account " + accountNumber);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount + " from account " + accountNumber);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance.");
     }
 }
 public String toString() {
     return "BankAccount{" +
             "accountNumber='" + accountNumber + '\'' +
             ", balance=" + balance +
             '}';
 }
}

//Customer class
class Customer {
 private String name;
 private ArrayList<BankAccount> accounts;

 // Constructor
 public Customer(String name) {
     this.name = name;
     this.accounts = new ArrayList<>();
 }

 // Method to add an account
 public void addAccount(BankAccount account) {
     accounts.add(account);
 }

 // Method to view all account balances
 public void viewBalances() {
     System.out.println("Customer: " + name);
     for (BankAccount account : accounts) {
         System.out.println(account);
     }
 }

 public String getName() {
     return name;
 }
}

//Bank class
class Bank {
 private String name;
 private ArrayList<Customer> customers;

 // Constructor
 public Bank(String name) {
     this.name = name;
     this.customers = new ArrayList<>();
 }

 // Method to open a new account for a customer
 public void openAccount(Customer customer, BankAccount account) {
     if (!customers.contains(customer)) {
         customers.add(customer);
     }
     customer.addAccount(account);
     System.out.println("Account " + account.getAccountNumber() + " opened for customer " + customer.getName() + " at " + name + " bank.");
 }

 // Method to list all customers
 public void listCustomers() {
     System.out.println("Customers of " + name + " Bank:");
     for (Customer customer : customers) {
         System.out.println(customer.getName());
     }
 }
}
//Main class to demonstrate association
public class BankSystem{
 public static void main(String[] args) {
     // Create a bank
     Bank bank = new Bank("SBI ");

     // Create customers
     Customer customer1 = new Customer("Om");
     Customer customer2 = new Customer("Harsh");

     // Create bank accounts
     BankAccount account1 = new BankAccount("ACC123", 500.0);
     BankAccount account2 = new BankAccount("ACC124", 1000.0);
     BankAccount account3 = new BankAccount("ACC125", 1500.0);

     // Open accounts for customers
     bank.openAccount(customer1, account1);
     bank.openAccount(customer1, account2);
     bank.openAccount(customer2, account3);

     // View balances for each customer
     customer1.viewBalances();
     customer2.viewBalances();

     // List all customers of the bank
     bank.listCustomers();
 }
}
