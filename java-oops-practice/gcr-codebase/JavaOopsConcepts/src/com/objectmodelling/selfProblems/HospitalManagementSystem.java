package com.objectmodelling.selfProblems;

import java.util.ArrayList;
import java.util.List;

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients;

    // Constructor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Method for consultation
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " is consulting with patient " + patient.getName());
    }

    // Display all patients the doctor is consulting
    public void displayPatients() {
        System.out.println("Dr. " + name + "'s Patients:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Patient class
class Patient {
    private String name;
    private List<Doctor> doctors;

    // Constructor
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Add a doctor to the patient's list
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Display all doctors consulting the patient
    public void displayDoctors() {
        System.out.println("Patient " + name + "'s Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(" - Dr. " + doctor.getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Hospital class
class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display all doctors in the hospital
    public void displayDoctors() {
        System.out.println("Doctors at " + name + " Hospital:");
        for (Doctor doctor : doctors) {
            System.out.println(" - Dr. " + doctor.getName());
        }
    }

    // Display all patients in the hospital
    public void displayPatients() {
        System.out.println("Patients at " + name + " Hospital:");
        for (Patient patient : patients) {
            System.out.println(" - " + patient.getName());
        }
    }
}

// Main class to demonstrate the hospital system
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Om");
        Doctor doctor2 = new Doctor("Harsh");

        // Create patients
        Patient patient1 = new Patient("Bipin");
        Patient patient2 = new Patient("Durgesh");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Perform consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display doctors and patients
        hospital.displayDoctors();
        hospital.displayPatients();

        // Display individual doctor-patient relationships
        doctor1.displayPatients();
        doctor2.displayPatients();

        // Display individual patient-doctor relationships
        patient1.displayDoctors();
        patient2.displayDoctors();
    }
}
