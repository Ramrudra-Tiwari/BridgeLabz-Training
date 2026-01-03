package com.inheritance.hybridinheritance.restaurant;

/*
 * Chef class
 * - Inherits Person class
 * - Implements Worker interface
 * This is Hybrid Inheritance
 */
public class Chef extends Person implements Worker {

    private String speciality;

    // Method to set chef speciality
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    // Implementation of interface method
    @Override
    public void performDuties() {
        System.out.println("Chef is cooking " + speciality + " dishes.");
    }
}
