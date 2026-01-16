package com.trafficmanager;

import java.util.Scanner;

public class TrafficManagerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roundabout capacity: ");
        int capacity = sc.nextInt();
        sc.nextLine();

        TrafficRoundabout roundabout = new TrafficRoundabout(capacity);

        int choice;

        do {
            System.out.println("\n=== Traffic Manager ===");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Show Roundabout State");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter vehicle number: ");
                    roundabout.addVehicle(sc.nextLine());
                    break;

                case 2:
                    roundabout.removeVehicle();
                    break;

                case 3:
                    roundabout.showRoundabout();
                    break;

                case 4:
                    System.out.println("Traffic system closed.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 4);

        sc.close();
    }
}
