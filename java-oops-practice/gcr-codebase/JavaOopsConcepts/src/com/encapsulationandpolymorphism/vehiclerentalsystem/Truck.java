package com.encapsulationandpolymorphism.vehiclerentalsystem;

// creating Truck class
public class Truck extends Vehicle implements Insurable {

    // Private insurance policy number
    private String insurancePolicyNumber;

    // Setter for insurance policy number
    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Rental cost calculation
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 1.5;
    }

    // Insurance calculation
    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
