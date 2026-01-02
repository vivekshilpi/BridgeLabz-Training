package hospitalPatientManagementSystem;

public class HospitalManagementSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", 5);
        Patient p2 = new OutPatient(102, "Neha", "01-Jan-2026");

        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

        Bill bill = new Bill(500, 1200, 100);

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}

