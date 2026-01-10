package com.fittrack;

import java.util.Scanner;

public class FitTrackApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("******************************************");
        System.out.println("    💪 Welcome to Titu FitTrack App   ");
        System.out.println("******************************************");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        sc.nextLine(); // buffer clear
        System.out.print("Enter your fitness goal: ");
        String goal = sc.nextLine();

        System.out.print("Enter daily target calories to burn: ");
        int targetCalories = sc.nextInt();

        UserProfile user = new UserProfile(name, age, weight, goal, targetCalories);

        boolean exit = false;
        int totalBurned = 0;

        while (!exit) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Cardio Workout");
            System.out.println("2. Strength Workout");
            System.out.println("3. View Daily Progress");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            Workout workout = null;

            switch (choice) {

                case 1:
                    System.out.print("Enter duration (minutes): ");
                    int cardioTime = sc.nextInt();
                    workout = new CardioWorkout(cardioTime);
                    break;

                case 2:
                    System.out.print("Enter duration (minutes): ");
                    int strengthTime = sc.nextInt();
                    workout = new StrengthWorkout(strengthTime);
                    break;

                case 3:
                    int remaining = user.getDailyTarget() - totalBurned; // operator
                    System.out.println("\n📊 Daily Progress");
                    System.out.println("🔥 Calories Burned: " + totalBurned);
                    System.out.println("🎯 Target Calories: " + user.getDailyTarget());
                    if(remaining >0) {
                    	System.out.println("⏳ Remaining: " + remaining);                    	
                    }
                    else {
                    	System.out.println
                    	("You have achived our goal...");
                    }
                    continue;

                case 4:
                    System.out.println("👋 Workout completed Champs!");
                    exit = true;
                    continue;

                default:
                    System.out.println("❌ Invalid choice");
                    continue;
            }

            // Polymorphism
            workout.startWorkout();
            int burned = workout.calculateCalories();
            workout.stopWorkout();

            totalBurned += burned;

            System.out.println("🔥 Calories burned in this workout: " + burned);
        }

        sc.close();
    }
}
