package com.swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.80; // 20% discount
    }
}
