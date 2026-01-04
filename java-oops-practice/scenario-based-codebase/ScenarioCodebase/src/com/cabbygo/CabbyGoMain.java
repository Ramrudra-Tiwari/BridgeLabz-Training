package com.cabbygo;

import java.util.Scanner;

// Creating an Main class
public class CabbyGoMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Driver driver = new Driver("Rahul", "DL12345", 4.7);

        System.out.println("Select Vehicle");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");

        int choice = sc.nextInt();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Mini("MH01A1234");
        } else if (choice == 2) {
            vehicle = new Sedan("MH02B5678");
        } else {
            vehicle = new SUV("MH03C9999");
        }

        driver.showDriverDetails();
        vehicle.bookRide(distance);
        vehicle.endRide();

        sc.close();
    }
}
