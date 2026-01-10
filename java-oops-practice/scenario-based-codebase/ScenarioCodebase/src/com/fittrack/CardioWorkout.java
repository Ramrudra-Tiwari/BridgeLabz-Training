package com.fittrack;

public class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    // Cardio burns more calories
    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 10; // operator
        return caloriesBurned;
    }
}
