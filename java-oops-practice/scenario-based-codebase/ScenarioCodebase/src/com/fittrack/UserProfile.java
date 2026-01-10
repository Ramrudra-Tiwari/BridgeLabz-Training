package com.fittrack;

public class UserProfile {

    private String name;
    private int age;
    private double weight;        // private health data
    private int dailyTarget;      // user defined target calories
    private String goal;

    // Constructor with user-defined target
    public UserProfile(String name, int age, double weight, String goal, int dailyTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyTarget = dailyTarget;
    }

    // Encapsulation – no setter for weight
    public double getWeight() {
        return weight;
    }

    public int getDailyTarget() {
        return dailyTarget;
    }

    public String getName() {
        return name;
    }

    public String getGoal() {
        return goal;
    }
}
