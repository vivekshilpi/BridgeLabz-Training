package pay_xpress;

public class WaterBill extends Bill {

    WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    public void pay() {
        if (isPaid()) {
            System.out.println("Water bill already paid");
            return;
        }
        markPaid();
        System.out.println("Water bill paid successfully");
    }

    public void sendReminder() {
        System.out.println("Reminder: Save water! Pay your water bill.");
    }
}
