package com.generics.mealplanner;

// generic meal class
public class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMeal() {
        System.out.println("Meal Type: " + mealPlan.getMealType());
        System.out.println("Daily Calories: " + mealPlan.getCalories());
    }
}
