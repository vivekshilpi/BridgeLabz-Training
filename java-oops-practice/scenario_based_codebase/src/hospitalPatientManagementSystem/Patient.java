package hospitalPatientManagementSystem;

class Patient {
    private int patientId;
    private String name;
    private String medicalHistory;   // sensitive data

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = "Not Provided";
    }

    public Patient(int patientId, String name, String medicalHistory) {   // emergency admission
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "ID: " + patientId + ", Name: " + name;
    }

    public void displayInfo() {
        System.out.println("Patient -> " + getSummary());
    }
}
