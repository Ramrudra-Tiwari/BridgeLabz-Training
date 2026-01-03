package com.encapsulationandpolymorphism.ecommerceplatform;

// Electronics product class
public class Electronics extends Product implements Taxable {

    // Discount for electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    // Tax calculation
    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}
