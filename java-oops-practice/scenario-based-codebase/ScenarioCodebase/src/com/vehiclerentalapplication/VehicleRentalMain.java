package com.vehiclerentalapplication;

import java.util.Scanner;

// Creating a Main class
public class VehicleRentalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Taking  Customer input
        System.out.print("Enter Customer ID: ");
        String cid = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String cname = sc.nextLine();

        Customer customer = new Customer(cid, cname);

        // Displaying the Vehicle selection
        System.out.println("\nChoose Vehicle");
        System.out.println("1. Bike");
        System.out.println("2. Car");
        System.out.println("3. Truck");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter rental days: ");
        int days = sc.nextInt();

        Vehicle vehicle = null;

        // Applying Polymorphism
        if (choice == 1) {
            vehicle = new Bike("B101", "Honda", 300);
        } else if (choice == 2) {
            vehicle = new Car("C202", "Fronx", 800);
        } else if (choice == 3) {
            vehicle = new Truck("T303", "Grant vitarai", 1200);
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        // Output
        System.out.println("\n===== RENT DETAILS =====");
        customer.showCustomerDetails();
        System.out.println("------------------------");
        vehicle.showVehicleDetails();
        System.out.println("Days        : " + days);
        System.out.println("Total Rent  : ₹" + vehicle.calculateRent(days));

        sc.close();
    }
}
