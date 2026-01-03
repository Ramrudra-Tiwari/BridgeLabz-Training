package com.encapsulationandpolymorphism.ecommerceplatform;

// Clothing product class
public class Clothing extends Product implements Taxable {

    // Discount for clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    // Tax calculation
    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "12% GST on Clothing";
    }
}
