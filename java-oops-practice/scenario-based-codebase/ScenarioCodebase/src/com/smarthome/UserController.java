package com.smarthome;

import java.util.Scanner;

//Creating  Main class
public class UserController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Appliance light = new Light(10);
        Appliance fan = new Fan(50);
        Appliance ac = new AC(150);

        System.out.println("Select Appliance");
        System.out.println("1. Light");
        System.out.println("2. Fan");
        System.out.println("3. AC");

        int choice = sc.nextInt();
        Appliance device;

        if (choice == 1) {
            device = light;
        } else if (choice == 2) {
            device = fan;
        } else {
            device = ac;
        }

        device.turnOn();

        // Operator usage
        if (device.getPower() > 100) {
            System.out.println("High power consuming");
        } else {
            System.out.println("Low power consuming");
        }

        device.turnOff();
        sc.close();
    }
}
