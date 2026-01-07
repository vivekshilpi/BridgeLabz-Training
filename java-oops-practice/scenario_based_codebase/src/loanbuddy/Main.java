package loanbuddy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Applicant Details ----------
        System.out.println("Enter Applicant Name:");
        String name = sc.nextLine();

        System.out.println("Enter Credit Score:");
        int creditScore = sc.nextInt();

        System.out.println("Enter Monthly Income:");
        double income = sc.nextDouble();

        System.out.println("Enter Loan Amount:");
        double loanAmount = sc.nextDouble();

        Applicant applicant =
                new Applicant(name, creditScore, income, loanAmount);

        // ---------- Loan Selection ----------
        System.out.println("\nSelect Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.println("3. Personal Loan");

        int choice = sc.nextInt();

        System.out.println("Enter Loan Tenure (in months):");
        int tenure = sc.nextInt();

        LoanApplication loan = null;

        switch (choice) {
            case 1:
                loan = new HomeLoan(loanAmount, tenure);
                break;

            case 2:
                loan = new AutoLoan(loanAmount, tenure);
                break;

            case 3:
                loan = new PersonalLoan(loanAmount, tenure);
                break;

            default:
                System.out.println("Invalid Loan Type Selected");
                System.exit(0);
        }

        // ---------- Loan Approval ----------
        System.out.println("\nProcessing Loan Application...");

        if (loan.approveLoan(applicant)) {
            System.out.println("✅ Loan Approved");
            System.out.printf("Monthly EMI: %.2f%n", loan.calculateEMI());
        } else {
            System.out.println("❌ Loan Rejected due to eligibility criteria");
        }

        sc.close();
    }
}
