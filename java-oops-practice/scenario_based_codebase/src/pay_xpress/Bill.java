package pay_xpress;

abstract class Bill implements IPayable {

    private String type;
    private double amount;
    private String dueDate;
    private boolean isPaid;

    Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    public String getType() {
        return type;
    }

    public boolean isPaid() {
        return isPaid;
    }

    protected double calculateLateFee(double penalty) {
        return amount + penalty;   
    }

    protected void markPaid() {
        isPaid = true;
    }

    public void showBill() {
        System.out.println(type + " | Amount: ₹" + amount +
                " | Due: " + dueDate +
                " | Status: " + (isPaid ? "PAID" : "PENDING"));
    }
}