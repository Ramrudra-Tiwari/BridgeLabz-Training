package com.petpal;

import java.util.Scanner;

public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("#######################################");
        System.out.println("     🐾 Welcome to  My PetPal App    ");
        System.out.println("#######################################");

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        System.out.println("Choose pet type:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Pet pet;

        if (choice == 1) {
            pet = new Dog(name, age);
        } else if (choice == 2) {
            pet = new Cat(name, age);
        } else {
            pet = new Bird(name, age);
        }

        boolean exit = false;

        while (!exit) {

            System.out.println("\nChoose an action:");
            System.out.println("1. Feed Pet");
            System.out.println("2. Play with Pet");
            System.out.println("3. Put Pet to Sleep");
            System.out.println("4. Make Sound");
            System.out.println("5. View Pet Status");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int action = sc.nextInt();

            switch (action) {

                case 1:
                    pet.feed();
                    break;

                case 2:
                    pet.play();
                    break;

                case 3:
                    pet.sleep();
                    break;

                case 4:
                    pet.makeSound(); // polymorphism
                    break;

                case 5:
                    pet.showStatus();
                    break;

                case 6:
                    System.out.println("👋 Thanks for taking care of your pet!");
                    exit = true;
                    break;

                default:
                    System.out.println("❌ Invalid choice");
            }
        }

        sc.close();
    }
}
