package com.inheritance.hybridinheritance.vehiclemanagement;

//
// PetrolVehicle class
//Inherits Vehicle
// Implements Refuelable interface
// Demonstrates Hybrid Inheritance
public class PetrolVehicle extends Vehicle implements Refuelable {

    // Refuel petrol vehicle
    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled...");
    }
}
