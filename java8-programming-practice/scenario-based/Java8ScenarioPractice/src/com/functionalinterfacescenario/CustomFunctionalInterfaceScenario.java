package com.functionalinterfacescenario;

public class CustomFunctionalInterfaceScenario {

    // 1. Bonus calculation
    @FunctionalInterface
    interface BonusCalculator {
        double calculate(double salary);
    }

    // 2. Loan eligibility
    @FunctionalInterface
    interface LoanEligibility {
        boolean isEligible(double salary, int years);
    }

    // 3. Tax calculation
    @FunctionalInterface
    interface TaxCalculator {
        double calculateTax(double income);
    }

    // 4. Validate user login
    @FunctionalInterface
    interface LoginValidator {
        boolean validate(String username, String password);
    }

    public static void main(String[] args) {

        // 1. Bonus
        System.out.println("----- Bonus Calculation -----");
        BonusCalculator bonus = salary -> salary * 0.1;
        System.out.println("Bonus for 50000: " + bonus.calculate(50000));

        // 2. Loan eligibility
        System.out.println("\n----- Loan Eligibility -----");
        LoanEligibility loan = (salary, years) -> salary > 30000 && years > 2;
        System.out.println("Eligible? " + loan.isEligible(35000, 3));

        // 3. Tax calculation
        System.out.println("\n----- Tax Calculation -----");
        TaxCalculator tax = income -> income * 0.15;
        System.out.println("Tax on 60000: " + tax.calculateTax(60000));

        // 4. Login validation
        System.out.println("\n----- Login Validation -----");
        LoginValidator login = (user, pass) -> user.equals("admin") && pass.equals("1234");
        System.out.println("Login success? " + login.validate("admin","1234"));
    }
}
