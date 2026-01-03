package com.encapsulationandpolymorphism.ridehailingapplication;

//Creating  Bike class
public class Bike extends Vehicle implements GPS {

    // Private GPS location
    private String location = "Unknown";

    // Fare calculation for bike
    @Override
    public double calculateFare(double distance) {
        return (ratePerKm * distance) * 0.8;
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
