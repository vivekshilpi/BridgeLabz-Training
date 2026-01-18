package pay_xpress;

public class ElectricityBill extends Bill {

    ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    public void pay() {
        if (isPaid()) {
            System.out.println("Electricity bill already paid");
            return;
        }
        markPaid();
        System.out.println("Electricity bill paid successfully");
    }

    public void sendReminder() {
        System.out.println("Reminder: Electricity bill due soon!");
    }
}