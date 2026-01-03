package com.inheritance.hybridinheritance.vehiclemanagement;

/*
 * ElectricVehicle class
 * Inherits Vehicle
 * Has charging behavior
 */
public class ElectricVehicle extends Vehicle {

    // Charge electric vehicle
    public void chargeVehicle() {
        System.out.println("Electric vehicle is charging...");
    }
}
