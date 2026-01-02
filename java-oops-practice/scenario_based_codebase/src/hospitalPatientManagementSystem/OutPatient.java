package hospitalPatientManagementSystem;

class OutPatient extends Patient {
    private String visitDate;

    public OutPatient(int id, String name, String date) {
        super(id, name);
        this.visitDate = date;
    }

    @Override
    public void displayInfo() {
        System.out.println("OutPatient | " + getSummary() + " | Visit: " + visitDate);
    }
}

