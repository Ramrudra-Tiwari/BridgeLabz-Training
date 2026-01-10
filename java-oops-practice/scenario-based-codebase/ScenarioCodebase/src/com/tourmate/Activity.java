package com.tourmate;

// Activity service (sightseeing, adventure, etc.)
public class Activity {

    private String activityName;
    private double cost;

    public Activity(String activityName, double cost) {
        this.activityName = activityName;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getActivityName() {
        return activityName;
    }
}
