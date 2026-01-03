package com.encapsulationandpolymorphism.vehiclerentalsystem;

//creating  Bike class
public class Bike extends Vehicle implements Insurable {

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
        return 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + insurancePolicyNumber;
    }
}
