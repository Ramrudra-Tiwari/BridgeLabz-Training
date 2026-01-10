package com.swiftcart;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        boolean exit = false;

        System.out.println("=================================");
        System.out.println("     🛒 Welcome to SwiftCart     ");
        System.out.println("=================================");

        while (!exit) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Add Product to Cart");
            System.out.println("2. View Bill");
            System.out.println("3. Apply Coupon & Checkout");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine(); // buffer clear

                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();

                    System.out.println("Select product type:");
                    System.out.println("1. Veg (Milk, Veggies)");
                    System.out.println("2. Non-veg (Rice, Oil)");
                    System.out.print("Enter type: ");
                    int type = sc.nextInt();

                    Product product;

                    if (type == 1) {
                        product = new PerishableProduct(name, price);
                    } else {
                        product = new NonPerishableProduct(name, price);
                    }

                    cart.addProduct(product, quantity);
                    System.out.println("✅ Product added to cart!");
                    break;

                case 2:
                    System.out.println("\n🧾 Generating Bill...");
                    cart.generateBill();
                    break;

                case 3:
                    System.out.print("Enter coupon amount: ");
                    double coupon = sc.nextDouble();
                    cart.applyDiscount(coupon);
                    System.out.println("🎉 Coupon applied successfully!");
                    cart.generateBill();
                    System.out.println("🛍️ Thank you for shopping with SwiftCart!");
                    exit = true;
                    break;

                case 4:
                    System.out.println("👋 Exiting SwiftCart. See you soon!");
                    exit = true;
                    break;

                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
