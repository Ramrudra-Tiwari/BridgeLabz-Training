package com.generics.warehouse;

import java.util.Scanner;
import com.generics.warehouse.*;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Storage<Electronics> electronicsStore = new Storage<>();
        Storage<Groceries> groceryStore = new Storage<>();
        Storage<Furniture> furnitureStore = new Storage<>();

        int choice;

        // menu keeps running until user exits
        do {
            System.out.println("\n==== Smart Warehouse Management System ====");
            System.out.println("1. Add Electronics Item");
            System.out.println("2. Add Grocery Item");
            System.out.println("3. Add Furniture Item");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume extra newline

            switch (choice) {

                case 1:
                    // input for electronics
                    System.out.print("Enter electronics name: ");
                    String eName = sc.nextLine();

                    System.out.print("Enter price: ");
                    double ePrice = sc.nextDouble();

                    System.out.print("Enter warranty years: ");
                    int warranty = sc.nextInt();

                    electronicsStore.addItem(
                            new Electronics(eName, ePrice, warranty)
                    );

                    System.out.println("Electronics item added successfully.");
                    break;

                case 2:
                    // input for groceries
                    System.out.print("Enter grocery name: ");
                    String gName = sc.nextLine();

                    System.out.print("Enter price: ");
                    double gPrice = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter expiry date: ");
                    String expiry = sc.nextLine();

                    groceryStore.addItem(
                            new Groceries(gName, gPrice, expiry)
                    );

                    System.out.println("Grocery item added successfully.");
                    break;

                case 3:
                    // input for furniture
                    System.out.print("Enter furniture name: ");
                    String fName = sc.nextLine();

                    System.out.print("Enter price: ");
                    double fPrice = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter material: ");
                    String material = sc.nextLine();

                    furnitureStore.addItem(
                            new Furniture(fName, fPrice, material)
                    );

                    System.out.println("Furniture item added successfully.");
                    break;

                case 4:
                    // display all items using wildcard method
                    System.out.println("\n--- Electronics Items ---");
                    Storage.displayItems(electronicsStore.getItems());

                    System.out.println("\n--- Grocery Items ---");
                    Storage.displayItems(groceryStore.getItems());

                    System.out.println("\n--- Furniture Items ---");
                    Storage.displayItems(furnitureStore.getItems());
                    break;

                case 5:
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
