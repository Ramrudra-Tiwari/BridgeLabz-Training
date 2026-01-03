package com.inheritance.assisted.vehicleandtransportsystem;


// Creating Main class with polymorphism
public class VehicleMain {

    public static void main(String[] args) {

        // Creating objects of different subclasses
        Vehicle v1 = new Car();
        v1.maxSpeed = 180;
        v1.fuelType = "Petrol";
        ((Car) v1).seatCapacity = 5;

        Vehicle v2 = new Truck();
        v2.maxSpeed = 120;
        v2.fuelType = "Diesel";
        ((Truck) v2).loadCapacity = 10;

        Vehicle v3 = new Motorcycle();
        v3.maxSpeed = 150;
        v3.fuelType = "Petrol";
        ((Motorcycle) v3).hasCarrier = true;

        // Polymorphism: Vehicle array holding different objects
        Vehicle[] vehicles = { v1, v2, v3 };

        // Same method call, different behavior
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("------------------");
        }
    }
}
