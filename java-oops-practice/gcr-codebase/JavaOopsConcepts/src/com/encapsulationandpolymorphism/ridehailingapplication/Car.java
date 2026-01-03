package com.encapsulationandpolymorphism.ridehailingapplication;

//creating  Car class
public class Car extends Vehicle implements GPS {

    // Private GPS location
    private String location = "Unknown";

    // Fare calculation for car
    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    // Get current location
    @Override
    public String getCurrentLocation() {
        return location;
    }

    // Update location
    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}
