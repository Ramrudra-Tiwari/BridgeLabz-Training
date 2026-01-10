package com.eventease;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;     // once assigned → cannot be edited
    private double baseCost;       // pricing encapsulated
    private double serviceCost;
    private double discount;

    private static int idCounter = 1000;

    // Constructor without services
    public Event(String eventName, String location, String date, int attendees, double baseCost) {
        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.baseCost = baseCost;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with services
    public Event(String eventName, String location, String date, int attendees,
                 double baseCost, double serviceCost, double discount) {
        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.baseCost = baseCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Encapsulated cost calculation
    protected double calculateTotalCost() {
        return baseCost + serviceCost - discount; // operators
    }

    public void showEventDetails() {
        System.out.println("\n📅 Event Details");
        System.out.println("Event ID: " + eventId);
        System.out.println("Name: " + eventName);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
