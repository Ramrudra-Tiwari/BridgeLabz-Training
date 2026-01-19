package com.generics.warehouse;

// grocery product
public class Groceries extends WarehouseItem {

    private String expiryDate;

    public Groceries(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Grocery: " + getName()
                + ", Price: " + getPrice()
                + ", Expiry: " + expiryDate);
    }
}
