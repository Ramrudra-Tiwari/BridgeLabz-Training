package com.foodloop;

import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" 🍔 Welcome to FoodLoop App ");
        System.out.println("=================================");

        // Sample food items
        FoodItem paneer = new VegItem("Paneer Butter Masala", 250, 10);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 350, 8);

        Order order = new Order();

        System.out.println("Menu:");
        System.out.println("1. Paneer Butter Masala - ₹250");
        System.out.println("2. Chicken Biryani - ₹350");

        System.out.print("Choose item (1/2): ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        if (choice == 1) {
            order.addItem(paneer, qty);
        } else {
            order.addItem(chicken, qty);
        }

        order.placeOrder();

        sc.close();
    }
}
