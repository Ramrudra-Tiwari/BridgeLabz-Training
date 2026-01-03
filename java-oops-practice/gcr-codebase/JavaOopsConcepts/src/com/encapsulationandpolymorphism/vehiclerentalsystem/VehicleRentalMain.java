package com.encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

//creating main class to  demonstrating polymorphism
public class VehicleRentalMain {

    public static void main(String[] args) {

        // List of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Car object
        Car car = new Car();
        car.setVehicleNumber("CAR101");
        car.setType("Car");
        car.setRentalRate(2000);
        car.setInsurancePolicyNumber("CAR-INS-01");
        vehicles.add(car);

        // Bike object
        Bike bike = new Bike();
        bike.setVehicleNumber("BIKE102");
        bike.setType("Bike");
        bike.setRentalRate(500);
        bike.setInsurancePolicyNumber("BIKE-INS-02");
        vehicles.add(bike);

        // Truck object
        Truck truck = new Truck();
        truck.setVehicleNumber("TRUCK1S03");
        truck.setType("Truck");
        truck.setRentalRate(3000);
        truck.setInsurancePolicyNumber("TRUCK-INS-03");
        vehicles.add(truck);

        int days = 3;

        // Polymorphism in action
        for (Vehicle v : vehicles) {
            v.displayVehicle();
            System.out.println("Rental Cost for " + days + " days: " + v.calculateRentalCost(days));

            Insurable i = (Insurable) v;
            System.out.println("Insurance Cost: " + i.calculateInsurance());
            System.out.println(i.getInsuranceDetails());
            System.out.println();
        }
    }
}
