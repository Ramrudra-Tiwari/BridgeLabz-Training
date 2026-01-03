package com.encapsulationandpolymorphism.ecommerceplatform;

// Groceries product class
public class Groceries extends Product {

    // Discount for groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}
