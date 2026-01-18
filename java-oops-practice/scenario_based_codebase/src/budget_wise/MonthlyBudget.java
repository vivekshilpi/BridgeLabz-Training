package budget_wise;

import java.util.HashMap;
import java.util.Map;

public class MonthlyBudget extends Budget {

    MonthlyBudget(double income) {
        super(income);
    }

    public void generateReport() {
        System.out.println("\n--- Monthly Budget Report ---");
        System.out.println("Income: " + income);
        System.out.println("Expenses: " + calculateTotalExpenses());
        System.out.println("Savings: " + calculateSavings());
    }

    public void detectOverspend() {

        Map<String, Double> spent = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                spent.put(t.getCategory(),
                        spent.getOrDefault(t.getCategory(), 0.0) + t.getAmount());
            }
        }

        for (String cat : categoryLimits.keySet()) {
            if (spent.getOrDefault(cat, 0.0) > categoryLimits.get(cat)) {
                System.out.println("Overspending in " + cat);
            }
        }
    }
}
