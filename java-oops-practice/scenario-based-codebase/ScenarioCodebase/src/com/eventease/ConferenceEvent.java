package com.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date, int attendees,
                           double baseCost, double serviceCost, double discount) {
        super(name, location, date, attendees, baseCost, serviceCost, discount);
    }

    // Polymorphism
    @Override
    public void schedule() {
        System.out.println("🏢 Conference scheduled with professional setup & AV services.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("📊 Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Conference cancelled.");
    }
}
