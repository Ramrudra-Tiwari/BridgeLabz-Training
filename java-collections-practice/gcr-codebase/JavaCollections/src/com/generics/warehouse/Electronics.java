package com.generics.warehouse;

// electronics product
public class Electronics extends WarehouseItem {

    private int warrantyYears;

    public Electronics(String name, double price, int warrantyYears) {
        super(name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + getName()
                + ", Price: " + getPrice()
                + ", Warranty: " + warrantyYears + " years");
    }
}
