package hospitalPatientManagementSystem;

class Bill implements Payable {
    private double consultationFee;
    private double medicineCharges;
    private double discount;

    public Bill(double consultationFee, double medicineCharges, double discount) {
        this.consultationFee = consultationFee;
        this.medicineCharges = medicineCharges;
        this.discount = discount;
    }

    @Override
    public double calculatePayment() {
        double total = consultationFee + medicineCharges;
        double tax = total * 0.05;      // 5% tax
        total = total + tax - discount;
        return total;
    }
}

