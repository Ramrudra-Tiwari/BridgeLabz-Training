package com.payxpress;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main application class for PayXpress
public class PayXpressMain {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Bill> bills = new ArrayList<>();

    public static void main(String[] args) {

        showWelcome();

        boolean running = true;

        while (running) {

            showMenu();
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBill();
                    break;

                case 2:
                    viewBills();
                    break;

                case 3:
                    payBill();
                    break;

                case 4:
                    sendReminders();
                    break;

                case 0:
                    running = false;
                    System.out.println("\nThank you for using PayXpress!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        sc.close();
    }

    // Welcome screen
    private static void showWelcome() {
        System.out.println("=================================");
        System.out.println("        PAYXPRESS SYSTEM          ");
        System.out.println("=================================");
        System.out.println("Pay your utility bills with ease\n");
    }

    // Main menu
    private static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Utility Bill");
        System.out.println("2. View All Bills");
        System.out.println("3. Pay a Bill");
        System.out.println("4. Send Due Reminders");
        System.out.println("0. Exit");
        System.out.print("Choose option: ");
    }

    // Add bill dynamically
    private static void addBill() {

        System.out.println("\nSelect Utility Type:");
        System.out.println("1. Electricity");
        System.out.println("2. Water");
        System.out.println("3. Internet");
        System.out.print("Choice: ");

        int type = sc.nextInt();

        System.out.print("Enter Amount: ₹");
        double amount = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter Due Date (dd-mm-yyyy): ");
        String dueDate = sc.nextLine();

        Bill bill = null;

        if (type == 1) {
            bill = new ElectricityBill(amount, dueDate);
        } else if (type == 2) {
            bill = new WaterBill(amount, dueDate);
        } else if (type == 3) {
            bill = new InternetBill(amount, dueDate);
        } else {
            System.out.println("Invalid utility type.");
            return;
        }

        bills.add(bill);
        System.out.println("Bill added successfully.");
    }

    // View bills
    private static void viewBills() {

        if (bills.isEmpty()) {
            System.out.println("\nNo bills available.");
            return;
        }

        System.out.println("\nYour Bills:");
        int index = 1;
        for (Bill bill : bills) {
            System.out.println(index + ". " + bill.type +
                    " | Amount: ₹" + bill.amount +
                    " | Due: " + bill.dueDate +
                    " | Paid: " + bill.getPaymentStatus());
            index++;
        }
    }

    // Pay selected bill
    private static void payBill() {

        if (bills.isEmpty()) {
            System.out.println("\nNo bills to pay.");
            return;
        }

        viewBills();
        System.out.print("\nSelect bill number to pay: ");
        int choice = sc.nextInt();

        if (choice < 1 || choice > bills.size()) {
            System.out.println("Invalid selection.");
            return;
        }

        Bill bill = bills.get(choice - 1);

        if (bill.getPaymentStatus()) {
            System.out.println("Bill is already paid.");
            return;
        }

        bill.pay(); // Polymorphism
    }

    // Send reminders for unpaid bills
    private static void sendReminders() {

        if (bills.isEmpty()) {
            System.out.println("\nNo bills found.");
            return;
        }

        System.out.println("\nSending Reminders...");
        for (Bill bill : bills) {
            if (!bill.getPaymentStatus()) {
                bill.sendReminder(); // Polymorphism
            }
        }
    }
}
