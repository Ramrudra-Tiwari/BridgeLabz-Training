package com.medistore;

import java.time.LocalDate;

// Parent class for all medicines
public abstract class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected LocalDate expiryDate;

    private int quantity;          // stock hidden
    private final double discount; // sensitive pricing logic

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 50); // default stock = 50
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
        this.discount = 0.10; // 10% default discount
    }

    // Stock update sirf andar se
    protected void reduceStock(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("❌ Not enough stock available");
        }
    }

    protected int getQuantity() {
        return quantity;
    }

    // Private pricing logic
    private double applyDiscount(double total) {
        return total - (total * discount);
    }

    // Selling logic (operators used here)
    @Override
    public double sell(int qty) {

        if (checkExpiry()) {
            System.out.println("❌ Medicine expired. Cannot sell.");
            return 0;
        }

        if (qty > quantity) {
            System.out.println("❌ Insufficient stock");
            return 0;
        }

        // total price = price × quantity
        double total = price * qty;

        total = applyDiscount(total); // discount applied
        reduceStock(qty);             // stock adjustment

        return total;
    }

    public String getName() {
        return name;
    }
}
