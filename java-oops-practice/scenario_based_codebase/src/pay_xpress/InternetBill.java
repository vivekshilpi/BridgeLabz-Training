package pay_xpress;

public class InternetBill extends Bill {

    InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    public void pay() {
        if (isPaid()) {
            System.out.println("Internet bill already paid");
            return;
        }
        markPaid();
        System.out.println("Internet bill paid successfully");
    }

    public void sendReminder() {
        System.out.println("Reminder: Internet service will be disconnected!");
    }
}