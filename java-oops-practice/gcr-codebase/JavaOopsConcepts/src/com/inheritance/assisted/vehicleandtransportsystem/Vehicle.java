package com.inheritance.assisted.vehicleandtransportsystem;


public class Vehicle {

    int maxSpeed;
    String fuelType;

    // Method to display vehicle information of  max speed and fuel type 
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}
