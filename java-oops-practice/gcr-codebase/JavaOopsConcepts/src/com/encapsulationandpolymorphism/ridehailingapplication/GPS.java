package com.encapsulationandpolymorphism.ridehailingapplication;

// Interface for GPS functionality
public interface GPS {

    String getCurrentLocation();

    void updateLocation(String newLocation);
}
