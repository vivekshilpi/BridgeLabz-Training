package com.constructor.level1;

public class BankAccountMain {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("SBI465676", "John Doe", 8000, 6.0);

        sa.displayAccountDetails();

        sa.deposit(2000);
        sa.withdraw(1500);

        System.out.println("\nUpdated Balance: Rs" + sa.getBalance());

	}

}
