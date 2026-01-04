package com.vehiclerentalapplication;

// Parent class
public class Vehicle implements Rentable {

    // Protected fields
    protected String vehicleId;
    protected String brand;
    protected double baseRate;

    // Constructor
    public Vehicle(String vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    // Default rent calculation
    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }

    // Display details
    public void showVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Brand      : " + brand);
        System.out.println("Rate/day   : ₹" + baseRate);
    }
}
