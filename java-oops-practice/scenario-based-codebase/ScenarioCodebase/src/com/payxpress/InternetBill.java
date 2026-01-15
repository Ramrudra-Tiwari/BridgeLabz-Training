package com.payxpress;

public class InternetBill extends Bill {

    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay() {
        markAsPaid();
        System.out.println("Internet bill paid successfully.");
    }

    @Override
    public void sendReminder() {
        System.out.println("🌐 Internet Bill Reminder: Avoid service disruption.");
    }
}
