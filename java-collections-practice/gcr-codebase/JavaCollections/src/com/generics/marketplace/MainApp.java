package com.generics.marketplace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product<?>> catalog = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n==== Dynamic Online Marketplace ====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Clothing");
            System.out.println("3. Add Gadget");
            System.out.println("4. Apply Discount");
            System.out.println("5. Display All Products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter book name: ");
                    String bName = sc.nextLine();

                    System.out.print("Enter price: ");
                    double bPrice = sc.nextDouble();

                    catalog.add(new Product<>(bName, bPrice, new BookCategory()));
                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter clothing name: ");
                    String cName = sc.nextLine();

                    System.out.print("Enter price: ");
                    double cPrice = sc.nextDouble();

                    catalog.add(new Product<>(cName, cPrice, new ClothingCategory()));
                    System.out.println("Clothing added successfully.");
                    break;

                case 3:
                    System.out.print("Enter gadget name: ");
                    String gName = sc.nextLine();

                    System.out.print("Enter price: ");
                    double gPrice = sc.nextDouble();

                    catalog.add(new Product<>(gName, gPrice, new GadgetCategory()));
                    System.out.println("Gadget added successfully.");
                    break;

                case 4:
                    System.out.print("Enter discount percentage: ");
                    double discount = sc.nextDouble();

                    for (Product<?> p : catalog) {
                        DiscountUtil.applyDiscount(p, discount);
                    }

                    System.out.println("Discount applied to all products.");
                    break;

                case 5:
                    System.out.println("\n--- Product Catalog ---");
                    for (Product<?> p : catalog) {
                        p.displayProduct();
                    }
                    break;

                case 6:
                    System.out.println("Exiting marketplace...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
