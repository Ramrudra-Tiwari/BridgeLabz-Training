package com.birdsanctuary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BirdSanctuaryMain {

    private static ArrayList<Bird> birds = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("   Welcome to Bird Sanctuary    ");
        System.out.println("================================");

        boolean running = true;

        while (running) {
            showMenu();
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBirdFromUser();
                    break;
                case 2:
                    displayAllBirds();
                    break;
                case 3:
                    displayFlyingBirds();
                    break;
                case 4:
                    displaySwimmingBirds();
                    break;
                case 5:
                    deleteBirdById();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting Bird Sanctuary...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1. Add Bird");
        System.out.println("2. Display All Birds");
        System.out.println("3. Display Flying Birds");
        System.out.println("4. Display Swimming Birds");
        System.out.println("5. Delete Bird by ID");
        System.out.println("6. Exit");
        System.out.print("Enter choice: ");
    }

    private static void addBirdFromUser() {

        System.out.print("Enter Bird ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Bird Name: ");
        String name = sc.nextLine();

        System.out.println("Select Bird Type:");
        System.out.println("1. Eagle (Fly)");
        System.out.println("2. Duck (Fly + Swim)");
        System.out.println("3. Penguin (Swim)");
        System.out.println("4. Seagull (Fly + Swim)");
        System.out.println("5. Kiwi (Neither)");
        System.out.print("Enter option: ");

        int type = sc.nextInt();
        sc.nextLine();

        Bird bird = null;

        switch (type) {
            case 1:
                bird = new Eagle(id, name);
                break;
            case 2:
                bird = new Duck(id, name);
                break;
            case 3:
                bird = new Penguin(id, name);
                break;
            case 4:
                bird = new Seagull(id, name);
                break;
            case 5:
                bird = new Kiwi(id, name);
                break;
            default:
                System.out.println("Invalid bird type.");
                return;
        }

        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    private static void displayAllBirds() {

        if (birds.isEmpty()) {
            System.out.println("No birds in sanctuary.");
            return;
        }

        for (Bird b : birds) {
            System.out.println(b.getInfo());
            b.eat();

            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }

            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }

            System.out.println("----------------------------");
        }
    }

    private static void displayFlyingBirds() {

        boolean found = false;

        for (Bird b : birds) {
            if (b instanceof Flyable) {
                System.out.println(b.getInfo());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No flying birds found.");
        }
    }

    private static void displaySwimmingBirds() {

        boolean found = false;

        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                System.out.println(b.getInfo());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No swimming birds found.");
        }
    }

    private static void deleteBirdById() {

        if (birds.isEmpty()) {
            System.out.println("No birds to delete.");
            return;
        }

        System.out.print("Enter Bird ID to delete: ");
        String id = sc.nextLine();

        Iterator<Bird> iterator = birds.iterator();

        while (iterator.hasNext()) {
            Bird b = iterator.next();
            if (b.getId().equals(id)) {
                iterator.remove();
                System.out.println("Bird deleted successfully.");
                return;
            }
        }

        System.out.println("Bird ID not found.");
    }
}
