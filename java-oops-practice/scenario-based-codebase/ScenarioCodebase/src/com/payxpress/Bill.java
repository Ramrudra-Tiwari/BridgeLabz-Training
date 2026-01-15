package com.payxpress;

// Base Bill class
public abstract class Bill implements IPayable {

    protected String type;
    protected double amount;
    protected String dueDate;
    private boolean isPaid; // Encapsulated

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    protected double calculateLateFee(double penalty) {
        return amount + penalty; // operator usage
    }

    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean getPaymentStatus() {
        return isPaid;
    }
}
