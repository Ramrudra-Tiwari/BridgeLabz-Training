package com.foodloop;

// Veg food item
public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }

    // Polymorphism: veg discount
    @Override
    public double applyDiscount(double amount) {
        if (amount > 300) {
            return amount * 0.90; // 10% off
        }
        return amount;
    }
}
