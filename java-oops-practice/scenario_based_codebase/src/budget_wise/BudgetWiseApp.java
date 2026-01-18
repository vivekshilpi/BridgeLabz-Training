package budget_wise;

import java.util.Scanner;

public class BudgetWiseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Budget budget = null;

        while(true){
            System.out.println("\n--- BudgetWise Menu ---");
            System.out.println("1. Create Monthly Budget");
            System.out.println("2. Create Annual Budget");
            System.out.println("3. Add Category Limit");
            System.out.println("4. Add Transaction");
            System.out.println("5. Generate Report");
            System.out.println("6. Detect Overspend");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter monthly income: ");
                    budget = new MonthlyBudget(sc.nextDouble());
                    System.out.println("Monthly budget created");
                }

                case 2 -> {
                    System.out.print("Enter annual income: ");
                    budget = new AnnualBudget(sc.nextDouble());
                    System.out.println("Annual budget created");
                }

                case 3 -> {
                    System.out.print("Category: ");
                    String cat = sc.next();
                    System.out.print("Limit: ");
                    double lim = sc.nextDouble();
                    budget.addCategoryLimit(cat, lim);
                }

                case 4 -> {
                    System.out.print("Amount: ");
                    double amt = sc.nextDouble();
                    System.out.print("Type (INCOME/EXPENSE): ");
                    String type = sc.next();
                    System.out.print("Category: ");
                    String cat = sc.next();
                    System.out.print("Date: ");
                    String date = sc.next();

                    budget.addTransaction(
                            new Transaction(amt, type, cat, date)
                    );
                }

                case 5 -> budget.generateReport();

                case 6 -> budget.detectOverspend();

                case 7 -> {
                    System.out.println("BudgetWise closed");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}
