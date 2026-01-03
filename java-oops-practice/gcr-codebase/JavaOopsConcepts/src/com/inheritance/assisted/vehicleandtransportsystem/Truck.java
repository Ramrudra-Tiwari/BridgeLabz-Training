package com.inheritance.assisted.vehicleandtransportsystem;


// Creating Subclass Truck which is inherits from Vehicle
public class Truck extends Vehicle {

    int loadCapacity; // weight should be in tons

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
