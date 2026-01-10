package com.tourmate;

// Transport service (flight / train / bus)
public class Transport {

    private String mode;
    private double cost; // hidden cost

    public Transport(String mode, double cost) {
        this.mode = mode;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getMode() {
        return mode;
    }
}
