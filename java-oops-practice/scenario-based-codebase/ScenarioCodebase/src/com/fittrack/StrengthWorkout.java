package com.fittrack;

public class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    // Strength burns differently
    @Override
    public int calculateCalories() {
        caloriesBurned = duration * 7; // operator
        return caloriesBurned;
    }
}
