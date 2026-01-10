package com.swiftcart;

public class Product {

    protected String name;
    protected double price;
    protected String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Polymorphism ke liye
    public double applyDiscount(double price) {
        return price; // default no discount
    }

    // Encapsulation
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
