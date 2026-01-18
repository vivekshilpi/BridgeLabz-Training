package budget_wise;

public class Transaction {

    private double amount;
    private String type;      
    private String category;
    private String date;

    Transaction(double amount, String type, String category, String date) {
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.date = date;
    }

    double getAmount() {
        return amount;
    }

    String getType() {
        return type;
    }

    String getCategory() {
        return category;
    }
}