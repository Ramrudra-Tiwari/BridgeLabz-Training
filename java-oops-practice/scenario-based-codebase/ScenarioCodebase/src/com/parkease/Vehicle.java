package com.parkease;

// Parent class for all vehicles
public abstract class Vehicle implements IPayable {

    protected String vehicleNumber;
    protected double baseRate; // per hour rate

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
