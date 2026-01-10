package com.tourmate;

// International trip type
public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {

        super(destination, duration, transport, hotel, activity);
    }

    // Polymorphism: international booking logic
    @Override
    public void book() {
        System.out.println("🌍 International trip booked with passport & visa verification!");
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled with charges.");
    }
}
