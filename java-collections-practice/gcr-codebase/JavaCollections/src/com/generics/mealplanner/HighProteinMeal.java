package com.generics.mealplanner;

// high protein meal plan
public class HighProteinMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "High Protein";
    }

    @Override
    public int getCalories() {
        return 2200;
    }
}
