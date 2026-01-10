package com.parkease;

// Car vehicle type
public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50); // ₹50 per hour
    }

    // Polymorphism: car ka charge calculation
    @Override
    public double calculateCharges(int hours) {
        double amount = baseRate * hours;

        // overtime penalty
        if (hours > 5) {
            amount += 100;
        }
        return amount;
    }
}
