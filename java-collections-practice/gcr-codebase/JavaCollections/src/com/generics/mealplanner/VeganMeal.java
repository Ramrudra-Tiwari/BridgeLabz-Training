package com.generics.mealplanner;

// vegan meal plan
public class VeganMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public int getCalories() {
        return 1600;
    }
}
