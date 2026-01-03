package com.encapsulationandpolymorphism.hospitalpatientmanagement;

// Abstract class for Patient
public abstract class Patient {

    // Private fields for encapsulation
    private int patientId;
    private String name;
    private int age;

    // Getter and Setter for patientId
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method for bill calculation
    public abstract double calculateBill();

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Bill: " + calculateBill());
    }
}
