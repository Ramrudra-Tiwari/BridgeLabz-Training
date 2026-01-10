package com.parkease;

import java.util.Scanner;

public class ParkEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("..................................");
        System.out.println(" 🚗 Welcome to ParkEase System ");
        System.out.println("..................................");

        // Slot creation
        ParkingSlot slot = new ParkingSlot(101, "Car");

        // Vehicle input
        System.out.println("Select Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Car(vehicleNumber);
        } else if (choice == 2) {
            vehicle = new Bike(vehicleNumber);
        } else {
            vehicle = new Truck(vehicleNumber);
        }

        // Parking duration
        System.out.print("Enter Parking Duration (hours): ");
        int hours = sc.nextInt();

        ParkingManager manager = new ParkingManager();
        manager.assignSlot(slot, vehicle);

        // Charges calculation
        double charges = vehicle.calculateCharges(hours);

        System.out.println("\n🧾 Parking Bill");
        System.out.println("Vehicle No: " + vehicle.getVehicleNumber());
        System.out.println("Slot ID: " + slot.getSlotId());
        System.out.println("Total Charges: ₹" + charges);

        manager.showLogs();

        sc.close();
    }
}
