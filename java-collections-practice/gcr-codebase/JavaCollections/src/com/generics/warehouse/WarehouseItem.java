package com.generics.warehouse;

// base class for all warehouse products
public abstract class WarehouseItem {

    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // every product must define how it is displayed
    public abstract void displayInfo();
}
