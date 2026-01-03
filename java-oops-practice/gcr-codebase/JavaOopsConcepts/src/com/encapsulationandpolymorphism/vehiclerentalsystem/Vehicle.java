package com.encapsulationandpolymorphism.vehiclerentalsystem;

// Abstract Vehicle class
public abstract class Vehicle {

    // Private fields for encapsulation
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    // Getter and Setter for vehicleNumber
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for rentalRate
    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method for rental cost
    public abstract double calculateRentalCost(int days);

    // Method to display vehicle details
    public void displayVehicle() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
    }
}
