package com.artify;

import java.util.Scanner;

public class ArtifyApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println(" 🎨 Welcome to Artify Marketplace ");
        System.out.println("=================================");

        // User input
        System.out.print("Enter User Name: ");
        String userName = sc.nextLine();

        System.out.print("Enter Wallet Balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        User user = new User(userName, balance);

        System.out.println("\nSelect Artwork Type:");
        System.out.println("1. Digital Art");
        System.out.println("2. Print Art");

        int choice = sc.nextInt();
        sc.nextLine();

        // Artwork input
        System.out.print("Enter Artwork Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Artist Name: ");
        String artist = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter License Type: ");
        String licenseType = sc.nextLine();

        System.out.print("Preview available? (true/false): ");
        boolean preview = sc.nextBoolean();

        Artwork artwork;

        // Inheritance + polymorphism
        if (choice == 1) {
            artwork = new DigitalArt(title, artist, price, licenseType, preview);
        } else {
            artwork = new PrintArt(title, artist, price, licenseType, preview);
        }

        System.out.println("\n1. Purchase");
        System.out.println("2. License Only");
        int action = sc.nextInt();

        if (action == 1) {
            artwork.purchase(user);
        } else {
            artwork.license(user);
        }

        System.out.println("\n💰 Remaining Wallet Balance: ₹" + user.getWalletBalance());

        sc.close();
    }
}
