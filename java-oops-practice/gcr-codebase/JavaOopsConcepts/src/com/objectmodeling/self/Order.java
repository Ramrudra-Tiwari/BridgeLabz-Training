package com.objectmodeling.self;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            product.displayProduct();
        }
        System.out.println("Total Amount: Rs." + calculateTotal());
    }
}
