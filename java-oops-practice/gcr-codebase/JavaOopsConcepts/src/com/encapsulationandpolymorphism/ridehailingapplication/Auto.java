package com.encapsulationandpolymorphism.ridehailingapplication;

//Creating  Auto class
public class Auto extends Vehicle implements GPS {

    // Private GPS location
    private String location = "Unknown";

    // Fare calculation for auto
    @Override
    public double calculateFare(double distance) {
        return (ratePerKm * distance) + 20;
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