package com.traincompanion;

import java.util.Scanner;

public class TrainCompanionMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Train train = new Train();

        int choice;

        do {
            System.out.println("\n=== Train Companion System ===");
            System.out.println("1. Add Compartment");
            System.out.println("2. Move to Next Compartment");
            System.out.println("3. Move to Previous Compartment");
            System.out.println("4. Show Adjacent Compartments");
            System.out.println("5. Remove Current Compartment");
            System.out.println("6. Show All Compartments");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter compartment name (e.g. Pantry, WiFi): ");
                    String name = sc.nextLine();
                    train.addCompartment(name);
                    System.out.println("Compartment added.");
                    break;

                case 2:
                    train.moveNext();
                    break;

                case 3:
                    train.movePrevious();
                    break;

                case 4:
                    train.showAdjacent();
                    break;

                case 5:
                    train.removeCurrent();
                    break;

                case 6:
                    train.showAll();
                    break;

                case 7:
                    System.out.println("Thank you for using Train Companion.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
