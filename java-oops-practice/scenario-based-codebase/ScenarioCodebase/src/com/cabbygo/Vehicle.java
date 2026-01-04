package com.cabbygo;

// Creating Parent class Vehicle
public class Vehicle implements IRideService {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double fare;   //Using  Encapsulation

    // Creating Constructor
    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    //Getter for fare
    public double getFare() {
        return fare;
    }

    // Creating Method used by child classes
    protected void setFare(double fare) {
        this.fare = fare;
    }

    public void bookRide(double distance) {
        // this Will be overridden
    }

    public void endRide() {
        System.out.println(type + " ride ended. Total Fare: ₹" + fare);
    }
}
