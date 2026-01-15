package com.browserbuddy;

import java.util.Scanner;
import java.util.Stack;

public class BrowserBuddyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Tab> closedTabs = new Stack<>();
        Tab currentTab = new Tab("google.com");

        int choice;

        do {
            System.out.println("\n=== BrowserBuddy ===");
            System.out.println("1. Visit New Website");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show History");
            System.out.println("5. Close Tab");
            System.out.println("6. Restore Closed Tab");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter website URL: ");
                    String url = sc.nextLine();
                    currentTab.getHistory().visit(url);
                    break;

                case 2:
                    currentTab.getHistory().back();
                    break;

                case 3:
                    currentTab.getHistory().forward();
                    break;

                case 4:
                    currentTab.getHistory().showHistory();
                    break;

                case 5:
                    closedTabs.push(currentTab);
                    currentTab = new Tab("google.com");
                    System.out.println("Tab closed. New tab opened.");
                    break;

                case 6:
                    if (!closedTabs.isEmpty()) {
                        currentTab = closedTabs.pop();
                        System.out.println("Tab restored.");
                    } else {
                        System.out.println("No closed tabs to restore.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting BrowserBuddy...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Current Page: " + currentTab.getHistory().getCurrentPage());

        } while (choice != 7);

        sc.close();
    }
}
