package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

// Non-veg food item class
public class NonVegItem extends FoodItem implements Discountable {

    // Total price calculation including extra charge
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50;
    }

    // Discount for non-veg item
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount on Non-Veg Item";
    }
}
