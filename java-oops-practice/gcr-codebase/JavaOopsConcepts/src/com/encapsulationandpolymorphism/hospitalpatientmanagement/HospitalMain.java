package com.encapsulationandpolymorphism.hospitalpatientmanagement;

// Creating a Main class to  demonstrating polymorphism
public class HospitalMain {

    public static void main(String[] args) {

        // taking Patient reference for InPatient
        Patient p1 = new InPatient();
        p1.setPatientId(101);
        p1.setName("Anni");
        p1.setAge(30);

        InPatient ip = (InPatient) p1;
        ip.setDaysAdmitted(5);
        ip.addRecord("Heart Surgery");

        p1.getPatientDetails();
        ip.viewRecords();

        System.out.println();

        // Patient reference for OutPatient
        Patient p2 = new OutPatient();
        p2.setPatientId(102);
        p2.setName("Titu");
        p2.setAge(22);

        OutPatient op = (OutPatient) p2;
        op.addRecord("Fever");

        p2.getPatientDetails();
        op.viewRecords();
    }
}
