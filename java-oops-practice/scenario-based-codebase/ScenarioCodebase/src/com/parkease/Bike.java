package com.parkease;

// Bike vehicle type
public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20); // ₹20 per hour
    }

    @Override
    public double calculateCharges(int hours) {
        double amount = baseRate * hours;

        if (hours > 5) {
            amount += 50;
        }
        return amount;
    }
}
