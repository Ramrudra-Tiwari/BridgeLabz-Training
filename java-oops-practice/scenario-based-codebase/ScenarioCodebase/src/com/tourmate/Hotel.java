package com.tourmate;

// Hotel service
public class Hotel {

    private String name;
    private double cost; // encapsulated

    public Hotel(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
