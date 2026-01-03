package com.inheritance.assisted.vehicleandtransportsystem;


// Creating  Subclass Motorcycle which  inherits Vehicle
public class Motorcycle extends Vehicle {

    boolean hasCarrier;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}
