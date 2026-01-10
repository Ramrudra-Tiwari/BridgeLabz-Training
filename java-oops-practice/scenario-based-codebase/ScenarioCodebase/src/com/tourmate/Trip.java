package com.tourmate;

// Parent class for all trips
public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;

    // Association
    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    protected double totalBudget;

    // Constructor to create complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Operator usage: hotel + transport + activities
        this.totalBudget = hotel.getCost()
                + transport.getCost()
                + activity.getCost();
    }

    public void showTripDetails() {
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Transport: " + transport.getMode());
        System.out.println("Hotel: " + hotel.getName());
        System.out.println("Activity: " + activity.getActivityName());
        System.out.println("Total Budget: ₹" + totalBudget);
    }
}
