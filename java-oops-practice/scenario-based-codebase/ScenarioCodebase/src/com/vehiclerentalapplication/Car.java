package com.vehiclerentalapplication;

//Creating  Car class that extends Vehicle 
public class Car extends Vehicle {

    public Car(String vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 500;
    }
}
