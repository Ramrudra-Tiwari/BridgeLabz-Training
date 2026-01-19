package com.generics.mealplanner;

import java.util.Scanner;

public class MainApp {

    // generic method to generate meal plan
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        return new Meal<>(mealPlan);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Personalized Meal Plan Generator ====");
            System.out.println("1. Vegetarian Meal");
            System.out.println("2. Vegan Meal");
            System.out.println("3. Keto Meal");
            System.out.println("4. High Protein Meal");
            System.out.println("5. Exit");
            System.out.print("Choose your meal type: ");

            choice = sc.nextInt();

            Meal<?> meal = null;

            switch (choice) {

                case 1:
                    meal = generateMealPlan(new VegetarianMeal());
                    break;

                case 2:
                    meal = generateMealPlan(new VeganMeal());
                    break;

                case 3:
                    meal = generateMealPlan(new KetoMeal());
                    break;

                case 4:
                    meal = generateMealPlan(new HighProteinMeal());
                    break;

                case 5:
                    System.out.println("Thank you for using Meal Planner.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            if (meal != null) {
                System.out.println("\n--- Your Personalized Meal Plan ---");
                meal.displayMeal();
            }

        } while (choice != 5);

        sc.close();
    }
}
