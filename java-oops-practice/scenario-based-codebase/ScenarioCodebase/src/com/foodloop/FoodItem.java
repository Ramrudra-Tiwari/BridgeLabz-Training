package com.foodloop;

// Parent class for all food items
public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;

    private int stock; // stock hidden (encapsulation)

    // Constructor
    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Stock check
    public boolean isAvailable(int qty) {
        return qty <= stock;
    }

    // Stock update only internally
    protected void reduceStock(int qty) {
        if (qty <= stock) {
            stock -= qty;
        }
    }

    public double getPrice() {
        return price;
    }

    // Polymorphic discount method
    public abstract double applyDiscount(double amount);

    public String getName() {
        return name;
    }
}
