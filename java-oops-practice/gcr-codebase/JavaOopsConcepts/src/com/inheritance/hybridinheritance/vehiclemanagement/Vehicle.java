package com.inheritance.hybridinheritance.vehiclemanagement;


//Vehicle class (Superclass)
//Stores common information for all vehicles
 
public class Vehicle {

    protected String model;
    protected int maxSpeed;

    // Set basic vehicle information
    public void setVehicleDetails(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Display vehicle information
    public void displayVehicleDetails() {
        System.out.println("Vehicle Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
