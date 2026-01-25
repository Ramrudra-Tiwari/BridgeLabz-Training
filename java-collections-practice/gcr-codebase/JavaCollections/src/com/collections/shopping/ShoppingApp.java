package com.collections.shopping;

import java.util.Scanner;

public class ShoppingApp {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Shopping Cart ---");
            System.out.println("1. Add Product");
            System.out.println("2. Add To Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Sort By Price");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    int price = sc.nextInt();
                    cart.addProduct(name, price);
                    break;
                case 2:
                    System.out.print("Product Name: ");
                    cart.addToCart(sc.nextLine());
                    break;
                case 3:
                    cart.showCart();
                    break;
                case 4:
                    cart.showSortedByPrice();
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
