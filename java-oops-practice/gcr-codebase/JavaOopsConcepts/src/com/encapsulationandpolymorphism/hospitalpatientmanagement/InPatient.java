package com.encapsulationandpolymorphism.hospitalpatientmanagement;

// InPatient class
public class InPatient extends Patient implements MedicalRecord {

    // Private medical details
    private String diagnosis;
    private int daysAdmitted;
    private double dailyCharge = 3000;

    // Setter for days admitted
    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }

    // Bill calculation for in-patient
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    // Add medical record
    @Override
    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // View medical record
    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}
