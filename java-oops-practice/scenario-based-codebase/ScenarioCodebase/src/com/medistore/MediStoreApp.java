package com.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(" 💊 Welcome to MediStore System ");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        System.out.println("Select Medicine Type:");
        System.out.println("1. Tablet");
        System.out.println("2. Syrup");
        System.out.println("3. Injection");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
        LocalDate expiry = LocalDate.parse(sc.next());

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Medicine medicine;

        // Inheritance + polymorphism
        if (choice == 1) {
            medicine = new Tablet(name, price, expiry, qty);
        } else if (choice == 2) {
            medicine = new Syrup(name, price, expiry, qty);
        } else {
            medicine = new Injection(name, price, expiry, qty);
        }

        System.out.print("Enter quantity to sell: ");
        int sellQty = sc.nextInt();

        double billAmount = medicine.sell(sellQty);

        System.out.println("\n🧾 Sales Bill");
        System.out.println("Medicine: " + medicine.getName());
        System.out.println("Total Amount: ₹" + billAmount);

        sc.close();
    }
}
