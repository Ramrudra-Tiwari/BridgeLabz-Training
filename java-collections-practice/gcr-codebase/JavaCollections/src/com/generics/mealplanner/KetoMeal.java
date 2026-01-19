package com.generics.mealplanner;

// keto meal plan
public class KetoMeal implements MealPlan {

    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public int getCalories() {
        return 2000;
    }
}
