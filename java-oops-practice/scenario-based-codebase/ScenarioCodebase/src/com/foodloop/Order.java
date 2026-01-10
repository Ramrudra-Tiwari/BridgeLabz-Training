package com.foodloop;

import java.util.ArrayList;
import java.util.List;

// Order handling class
public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;
    private boolean isPlaced;

    // Add food item to order
    public void addItem(FoodItem item, int qty) {

        if (item.isAvailable(qty)) {

            items.add(item);

            // Operator: total = total + price × quantity
            total += item.getPrice() * qty;

            item.reduceStock(qty);

        } else {
            System.out.println("❌ Item out of stock: " + item.getName());
        }
    }

    // Order place logic
    @Override
    public void placeOrder() {

        double finalAmount = total;

        // Polymorphic discount application
        for (FoodItem item : items) {
            finalAmount = item.applyDiscount(finalAmount);
        }

        System.out.println("\n🍽️ Order Placed Successfully");
        System.out.println("Total Amount Payable: ₹" + finalAmount);
        isPlaced = true;
    }

    @Override
    public void cancelOrder() {
        if (!isPlaced) {
            System.out.println("❌ Order not placed yet");
        } else {
            System.out.println("Order cancelled");
        }
    }
}
