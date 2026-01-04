package com.vehiclerentalapplication;

// Creating Bike class that extends vehicle 
public class Bike extends Vehicle {

    public Bike(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }
}
