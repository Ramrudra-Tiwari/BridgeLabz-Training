package com.gamebox;

import java.util.Scanner;

// Main application class
public class GameBoxMain {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        showWelcome();

        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        User user = new User(username);

        ArcadeGame arcadeGame = new ArcadeGame("Speed Racer", 499, 4.5);
        StrategyGame strategyGame = new StrategyGame("War Tactics", 799, 4.7);

        boolean running = true;

        while (running) {

            showMenu();
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    showGames(arcadeGame, strategyGame);
                    break;

                case 2:
                    playDemo(arcadeGame, strategyGame);
                    break;

                case 3:
                    buyGame(user, arcadeGame, strategyGame);
                    break;

                case 4:
                    user.showOwnedGames();
                    break;

                case 5:
                    applySeasonOffer(strategyGame);
                    break;

                case 0:
                    running = false;
                    System.out.println("Exiting GameBox. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }

    private static void showWelcome() {
        System.out.println("========================================");
        System.out.println("    WELCOME TO TITU GAMEBOX APP       ");
        System.out.println("=======================================");
        System.out.println("Download • Demo • Play\n");
    }

    private static void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. View Available Games");
        System.out.println("2. Play Demo");
        System.out.println("3. Buy Game");
        System.out.println("4. View Owned Games");
        System.out.println("5. Apply Seasonal Offer");
        System.out.println("0. Exit");
        System.out.print("Choose option: ");
    }

    private static void showGames(Game g1, Game g2) {
        System.out.println("\nAvailable Games:");
        System.out.println("1. " + g1.getTitle() + " - ₹" + g1.getPrice());
        System.out.println("2. " + g2.getTitle() + " - ₹" + g2.getPrice());
    }

    private static void playDemo(ArcadeGame g1, StrategyGame g2) {
        System.out.println("\nChoose Game for Demo:");
        System.out.println("1. " + g1.getTitle());
        System.out.println("2. " + g2.getTitle());
        System.out.print("Enter choice: ");

        int demoChoice = sc.nextInt();

        IDownloadable demo;

        if (demoChoice == 1) {
            demo = g1;
        } else {
            demo = g2;
        }

        demo.playDemo(); // Polymorphism
    }

    private static void buyGame(User user, ArcadeGame g1, StrategyGame g2) {

        System.out.println("\nChoose Game to Buy:");
        System.out.println("1. " + g1.getTitle());
        System.out.println("2. " + g2.getTitle());
        System.out.print("Enter choice: ");

        int buyChoice = sc.nextInt();

        if (buyChoice == 1) {
            user.buyGame(g1);
        } else if (buyChoice == 2) {
            user.buyGame(g2);
        } else {
            System.out.println("Invalid selection.");
        }
    }

    private static void applySeasonOffer(Game game) {
        System.out.print("\nEnter discount percentage: ");
        double discount = sc.nextDouble();
        game.applySeasonalOffer(discount);
        System.out.println("Seasonal offer applied successfully.");
    }
}
