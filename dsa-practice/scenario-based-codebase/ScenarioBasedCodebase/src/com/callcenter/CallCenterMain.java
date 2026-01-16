package com.callcenter;

import java.util.Scanner;

public class CallCenterMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CallCenterManager manager = new CallCenterManager();

        int choice;

        do {
            System.out.println("\n=== Call Center System ===");
            System.out.println("1. Add Normal Call");
            System.out.println("2. Add VIP Call");
            System.out.println("3. Handle Next Call");
            System.out.println("4. Show Call Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter customer ID: ");
                    manager.addNormalCall(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter VIP customer ID: ");
                    manager.addVipCall(sc.nextLine());
                    break;

                case 3:
                    manager.handleNextCall();
                    break;

                case 4:
                    manager.showCallReport();
                    break;

                case 5:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 5);

        sc.close();
    }
}
