package hospitalPatientManagementSystem;

class InPatient extends Patient {
    private int daysAdmitted;

    public InPatient(int id, String name, int days) {
        super(id, name);
        this.daysAdmitted = days;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient | " + getSummary() + " | Days: " + daysAdmitted);
    }
}
