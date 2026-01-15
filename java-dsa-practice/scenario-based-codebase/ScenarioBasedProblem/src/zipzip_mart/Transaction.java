package zipzip_mart;

class Transaction {
    String date;      
    double amount;

    Transaction(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    void display() {
        System.out.println(date + " | ₹" + amount);
    }
}

