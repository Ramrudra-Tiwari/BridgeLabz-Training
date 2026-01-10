package com.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date, int attendees,
                         double baseCost, double serviceCost, double discount) {
        super(name, location, date, attendees, baseCost, serviceCost, discount);
    }

    // Polymorphism
    @Override
    public void schedule() {
        System.out.println("🎂 Birthday Event scheduled with decorations & fun activities!");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("🎉 Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Birthday Event cancelled.");
    }
}
