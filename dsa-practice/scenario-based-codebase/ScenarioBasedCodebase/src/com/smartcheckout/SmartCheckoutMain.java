package com.smartcheckout;

import java.util.*;

public class SmartCheckoutMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Supermarket market = new Supermarket();
        int choice;

        do {
            System.out.println("\n=== Smart Checkout System ===");
            System.out.println("1. Add Customer");
            System.out.println("2. Process Next Customer");
            System.out.println("3. Show Queue");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter items (comma separated): ");
                    String[] itemArray = sc.nextLine().split(",");

                    List<String> items = new ArrayList<>();
                    for (String item : itemArray) {
                        items.add(item.trim());
                    }

                    market.addCustomer(new Customer(name, items));
                    break;

                case 2:
                    market.processCustomer();
                    break;

                case 3:
                    market.showQueue();
                    break;

                case 4:
                    System.out.println("Checkout system closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
