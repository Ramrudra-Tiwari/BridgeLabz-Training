package com.eventease;

import java.util.Scanner;

public class EventEaseApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   🎉 Welcome to EventEase App   ");
        System.out.println("=================================");

        System.out.print("Enter organizer name: ");
        String name = sc.nextLine();

        System.out.print("Enter organizer email: ");
        String email = sc.nextLine();

        User user = new User(name, email);

        System.out.println("\nHello " + user.getName() + ", choose event type:");
        System.out.println("1. Birthday Event");
        System.out.println("2. Conference Event");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter event name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        System.out.print("Enter date: ");
        String date = sc.nextLine();

        System.out.print("Enter number of attendees: ");
        int attendees = sc.nextInt();

        System.out.print("Enter base venue cost: ");
        double baseCost = sc.nextDouble();

        System.out.print("Enter service cost (catering/decor): ");
        double serviceCost = sc.nextDouble();

        System.out.print("Enter discount amount: ");
        double discount = sc.nextDouble();

        Event event;

        if (choice == 1) {
            event = new BirthdayEvent(eventName, location, date, attendees,
                    baseCost, serviceCost, discount);
        } else {
            event = new ConferenceEvent(eventName, location, date, attendees,
                    baseCost, serviceCost, discount);
        }

        event.schedule();     // polymorphism
        event.showEventDetails();

        System.out.print("\nDo you want to reschedule? (yes/no): ");
        sc.nextLine();
        String res = sc.nextLine();

        if (res.equalsIgnoreCase("yes")) {
            System.out.print("Enter new date: ");
            String newDate = sc.nextLine();
            event.reschedule(newDate);
        }

        System.out.println("🎊 Event setup completed successfully!");
        sc.close();
    }
}
