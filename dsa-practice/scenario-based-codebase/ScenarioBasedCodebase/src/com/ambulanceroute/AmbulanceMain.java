package com.ambulanceroute;

import java.util.Scanner;

public class AmbulanceMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceRouteList route = new AmbulanceRouteList();

        int choice;

        System.out.println("=== Ambulance Route Emergency System ===");

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Hospital Unit");
            System.out.println("2. Display All Units");
            System.out.println("3. Find Nearest Available Unit");
            System.out.println("4. Remove Unit (Maintenance)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter unit name: ");
                    String name = sc.nextLine();

                    System.out.print("Is unit available (true/false): ");
                    boolean available = sc.nextBoolean();

                    route.addUnit(name, available);
                    System.out.println("Unit added successfully");
                    break;

                case 2:
                    System.out.println("\nHospital Units:");
                    route.displayUnits();
                    break;

                case 3:
                    System.out.println("\nChecking for available unit...");
                    route.findAvailableUnit();
                    break;

                case 4:
                    System.out.print("Enter unit name to remove: ");
                    String removeName = sc.nextLine();

                    route.removeUnit(removeName);
                    break;

                case 5:
                    System.out.println("System closed. Stay safe!");
                    break;

                default:
                    System.out.println("Invalid choice, try again");
            }

        } while (choice != 5);

        sc.close();
    }
}
