package com.encapsulationandpolymorphism.vehiclerentalsystem;

// Car class
public class Car extends Vehicle implements Insurable {

    // Private insurance policy number
    private String insurancePolicyNumber;

    // Setter for insurance policy number
    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Rental cost calculation
    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    // Insurance calculation
    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}
