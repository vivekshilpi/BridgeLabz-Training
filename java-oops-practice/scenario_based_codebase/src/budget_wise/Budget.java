package budget_wise;

import java.util.*;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected List<Transaction> transactions = new ArrayList<>();
    protected Map<String, Double> categoryLimits = new HashMap<>();

    Budget(double income) {
        this.income = income;
    }

    void addCategoryLimit(String category, double limit) {
        categoryLimits.put(category, limit);
    }

    void addTransaction(Transaction t) {
        transactions.add(t);
    }

    double calculateTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("EXPENSE")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    double calculateSavings() {
        return income - calculateTotalExpenses();
    }
}