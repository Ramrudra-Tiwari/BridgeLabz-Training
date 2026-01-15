package com.homenest;

import java.util.Scanner;

public class HomeNestMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("      Welcome to HomeNest");
        System.out.println(" Smart Home Device Manager System ");
        System.out.println("=================================\n");

        // device registration
        System.out.print("Enter Light Device ID: ");
        Light light = new Light(sc.nextInt());

        System.out.print("Enter Camera Device ID: ");
        Camera camera = new Camera(sc.nextInt());

        System.out.print("Enter Thermostat Device ID: ");
        Thermostat thermostat = new Thermostat(sc.nextInt());

        System.out.print("Enter Smart Lock Device ID: ");
        Lock lock = new Lock(sc.nextInt());

        Device[] devices = { light, camera, thermostat, lock };

        int choice;

        do {
            System.out.println("\n-------------------------------");
            System.out.println("        HomeNest Menu");
            System.out.println("-------------------------------");
            System.out.println("1. Turn ON all devices");
            System.out.println("2. Turn OFF all devices");
            System.out.println("3. Check energy usage");
            System.out.println("4. Reset all devices");
            System.out.println("5. Device status");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nTurning ON devices...");
                    for (Device d : devices) {
                        d.turnOn();
                    }
                    break;

                case 2:
                    System.out.println("\nTurning OFF devices...");
                    for (Device d : devices) {
                        d.turnOff();
                    }
                    break;

                case 3:
                    System.out.print("\nEnter usage hours: ");
                    int hours = sc.nextInt();

                    double total = 0;
                    for (Device d : devices) {
                        double usage = d.calculateEnergy(hours);
                        total += usage;
                        System.out.println("Device " + d.deviceId + " usage: " + usage + " units");
                    }
                    System.out.println("Total energy usage: " + total + " units");
                    break;

                case 4:
                    System.out.println("\nResetting all devices...");
                    for (Device d : devices) {
                        d.reset();   // polymorphism
                    }
                    break;

                case 5:
                    System.out.println("\nDevice Status:");
                    for (Device d : devices) {
                        System.out.println("Device " + d.deviceId + " -> " + (d.isOn() ? "ON" : "OFF"));
                    }
                    break;

                case 0:
                    System.out.println("\nThank you for using HomeNest");
                    System.out.println("System shutting down...");
                    break;

                default:
                    System.out.println("\nInvalid choice, try again");
            }

        } while (choice != 0);

        sc.close();
    }
}
