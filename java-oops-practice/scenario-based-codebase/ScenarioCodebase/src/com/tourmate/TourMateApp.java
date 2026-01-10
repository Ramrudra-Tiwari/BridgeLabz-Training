package com.tourmate;

import java.util.Scanner;

public class TourMateApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" ✈️ Welcome to TourMate Planner ");
        System.out.println("=================================");

        System.out.println("Select Trip Type:");
        System.out.println("1. Domestic Trip");
        System.out.println("2. International Trip");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Duration (days): ");
        int duration = sc.nextInt();
        sc.nextLine();

        // Transport input
        System.out.print("Enter Transport Mode: ");
        String mode = sc.nextLine();
        System.out.print("Enter Transport Cost: ");
        double transportCost = sc.nextDouble();

        // Hotel input
        sc.nextLine();
        System.out.print("Enter Hotel Name: ");
        String hotelName = sc.nextLine();
        System.out.print("Enter Hotel Cost: ");
        double hotelCost = sc.nextDouble();

        // Activity input
        sc.nextLine();
        System.out.print("Enter Activity Name: ");
        String activityName = sc.nextLine();
        System.out.print("Enter Activity Cost: ");
        double activityCost = sc.nextDouble();

        Transport transport = new Transport(mode, transportCost);
        Hotel hotel = new Hotel(hotelName, hotelCost);
        Activity activity = new Activity(activityName, activityCost);

        Trip trip;

        // Inheritance + Polymorphism
        if (choice == 1) {
            trip = new DomesticTrip(destination, duration, transport, hotel, activity);
        } else {
            trip = new InternationalTrip(destination, duration, transport, hotel, activity);
        }

        trip.book();

        System.out.println("\n🧳 Trip Summary");
        trip.showTripDetails();

        sc.close();
    }
}
