package com.payxpress;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Electricity bill paid successfully.");
    }

    @Override
    public void sendReminder() {
        System.out.println("⚡ Electricity Bill Reminder: High usage detected.");
    }
}
