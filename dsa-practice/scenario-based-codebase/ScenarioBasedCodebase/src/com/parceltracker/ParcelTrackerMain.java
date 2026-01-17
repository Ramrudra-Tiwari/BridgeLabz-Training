package com.parceltracker;

import java.util.Scanner;

public class ParcelTrackerMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();
        int choice;

        // default stages
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        do {
            System.out.println("\n=== Parcel Tracker System ===");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Intermediate Checkpoint");
            System.out.println("3. Mark Parcel as Lost");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    tracker.trackParcel();
                    break;

                case 2:
                    System.out.print("Add after stage: ");
                    String after = sc.nextLine();

                    System.out.print("New checkpoint name: ");
                    String checkpoint = sc.nextLine();

                    tracker.addCheckpoint(after, checkpoint);
                    break;

                case 3:
                    tracker.markParcelLost();
                    break;

                case 4:
                    System.out.println("Exiting Parcel Tracker.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
