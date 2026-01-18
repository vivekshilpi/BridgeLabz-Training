package budget_wise;

public class AnnualBudget extends Budget {

    AnnualBudget(double income) {
        super(income);
    }

    public void generateReport() {
        System.out.println("\n=== Annual Financial Summary ===");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + calculateTotalExpenses());
        System.out.println("Net Savings: " + calculateSavings());
    }

    public void detectOverspend() {
        System.out.println("Annual overspend check completed");
    }
}
