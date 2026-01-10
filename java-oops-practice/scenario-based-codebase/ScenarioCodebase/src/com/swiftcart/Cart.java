package com.swiftcart;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

    private List<Product> products; // Encapsulation
    private double totalPrice;

    // Empty cart
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Cart with pre-added items
    public Cart(List<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Sirf Cart hi price update kare
    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.getPrice() * quantity; // operator
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public double applyDiscount(double coupon) {
        totalPrice = totalPrice - coupon; // operator
        return totalPrice;
    }

    @Override
    public void generateBill() {
        double finalAmount = 0;

        for (Product p : products) {
            // Polymorphism
            finalAmount += p.applyDiscount(p.getPrice());
        }

        totalPrice = finalAmount;
        System.out.println("Total Bill Amount: ₹" + totalPrice);
    }
}
