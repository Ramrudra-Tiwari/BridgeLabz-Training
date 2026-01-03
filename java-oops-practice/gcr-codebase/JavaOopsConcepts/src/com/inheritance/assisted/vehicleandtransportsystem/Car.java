package com.inheritance.assisted.vehicleandtransportsystem;


// Subclass Car of inherits Vehicle
public class Car extends Vehicle {

    int seatCapacity;

    // Overriding the  displayInfo() method in it 
    @Override
    public void displayInfo() {
        super.displayInfo(); // calls Vehicle method
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
