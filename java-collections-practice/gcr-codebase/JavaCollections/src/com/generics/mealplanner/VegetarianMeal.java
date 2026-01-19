package com.generics.mealplanner;

// vegetarian meal plan
public class VegetarianMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public int getCalories() {
        return 1800;
    }
}
