package com.foodloop;

// Non-veg food item
public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    // Polymorphism: non-veg discount
    @Override
    public double applyDiscount(double amount) {
        if (amount > 500) {
            return amount * 0.85; // 15% off
        }
        return amount;
    }
}
