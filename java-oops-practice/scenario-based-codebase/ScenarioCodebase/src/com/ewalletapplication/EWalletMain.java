package com.ewalletapplication;

import java.util.Scanner;

// Creating Main class Ewallet 
public class EWalletMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User 1 input
        System.out.print("Enter User ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter User Name: ");
        String name1 = sc.nextLine();

        System.out.println("Select Wallet Type (1-Personal, 2-Business): ");
        int wtype1 = sc.nextInt();

        Wallet w1 = (wtype1 == 1) ? new PersonalWallet(true) : new BusinessWallet(true);
        User user1 = new User(id1, name1, w1);

        // User 2 (fixed demo user)
        Wallet w2 = new PersonalWallet(false);
        User user2 = new User(2, "DemoUser", w2);

        // Load money
        System.out.print("Enter amount to load: ");
        double load = sc.nextDouble();
        user1.getWallet().loadMoney(load);

        // Transfer
        System.out.print("Enter transfer amount: ");
        double transfer = sc.nextDouble();
        user1.getWallet().transferTo(user2, transfer);

        // Output
        System.out.println("\n===== USER 1 DETAILS =====");
        user1.showUser();
        user1.getWallet().showHistory();

        System.out.println("\n===== USER 2 DETAILS =====");
        user2.showUser();

        sc.close();
    }
}
