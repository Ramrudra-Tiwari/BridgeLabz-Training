package com.inheritance.hybridinheritance.vehiclemanagement;


// Vehicle Management System
//Main class to manage vehicles

public class VehicleManagementSystem {

    public static void main(String[] args) {

        // Managing Electric Vehicle
        ElectricVehicle electricCar = new ElectricVehicle();
        electricCar.setVehicleDetails("Tesla", 200);
        electricCar.displayVehicleDetails();
        electricCar.chargeVehicle();

        System.out.println();

        // Managing Petrol Vehicle
        PetrolVehicle petrolCar = new PetrolVehicle();
        petrolCar.setVehicleDetails("Honda City", 180);
        petrolCar.displayVehicleDetails();
        petrolCar.refuel();
    }
}
