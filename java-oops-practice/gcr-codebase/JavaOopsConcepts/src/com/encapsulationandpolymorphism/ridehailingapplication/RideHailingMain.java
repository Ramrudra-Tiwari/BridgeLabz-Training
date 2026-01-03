package com.encapsulationandpolymorphism.ridehailingapplication;

// Creating Main class to  demonstrating polymorphism
public class RideHailingMain {

    // Method to calculate fare dynamically
    public static void calculateRideFare(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
        System.out.println();
    }

    public static void main(String[] args) {

        // Car ride
        Vehicle v1 = new Car();
        v1.setVehicleId("CAR101");
        v1.setDriverName("Titu");
        v1.setRatePerKm(15);
        calculateRideFare(v1, 10);

        // Bike ride
        Vehicle v2 = new Bike();
        v2.setVehicleId("BIKE202");
        v2.setDriverName("Raman");
        v2.setRatePerKm(10);
        calculateRideFare(v2, 10);

        // Auto ride
        Vehicle v3 = new Auto();
        v3.setVehicleId("AUTO303");
        v3.setDriverName("Rajeeev");
        v3.setRatePerKm(12);
        calculateRideFare(v3, 10);
    }
}
