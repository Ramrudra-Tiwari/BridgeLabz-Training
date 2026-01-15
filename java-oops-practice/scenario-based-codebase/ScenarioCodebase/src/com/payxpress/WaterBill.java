package com.payxpress;

public class WaterBill extends Bill {

    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Water bill paid successfully.");
    }

    @Override
    public void sendReminder() {
        System.out.println("💧 Water Bill Reminder: Save water!");
    }
}
