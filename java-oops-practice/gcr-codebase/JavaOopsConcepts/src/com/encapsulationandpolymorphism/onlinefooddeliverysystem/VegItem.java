package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

// Veg food item class
public class VegItem extends FoodItem implements Discountable {

    // Total price calculation for veg item
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Discount for veg item
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount on Veg Item";
    }
}
