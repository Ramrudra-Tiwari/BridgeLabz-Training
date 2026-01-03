package com.encapsulationandpolymorphism.hospitalpatientmanagement;

// OutPatient class
public class OutPatient extends Patient implements MedicalRecord {

    // Private medical details
    private String diagnosis;
    private double consultationFee = 800;

    // Bill calculation for out-patient
    @Override
    public double calculateBill() {
        return consultationFee;
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
