package com.parkease;

// Truck vehicle type
public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100); // ₹100 per hour
    }

    @Override
    public double calculateCharges(int hours) {
        double amount = baseRate * hours;

        if (hours > 5) {
            amount += 200;
        }
        return amount;
    }
}
