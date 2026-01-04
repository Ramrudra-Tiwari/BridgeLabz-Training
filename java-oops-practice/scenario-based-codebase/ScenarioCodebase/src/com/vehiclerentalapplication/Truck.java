package com.vehiclerentalapplication;

// Creating Truck class that extends Vehicle 
public class Truck extends Vehicle {

    public Truck(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + (days * 300);
    }
}
