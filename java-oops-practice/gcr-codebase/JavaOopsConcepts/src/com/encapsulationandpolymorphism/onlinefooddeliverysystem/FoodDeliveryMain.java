package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

// Creating Main class to  demonstrating polymorphism
public class FoodDeliveryMain {

    // Applying Single order processing method using polymorphism
    public static void processOrder(List<FoodItem> items) {

        for (FoodItem item : items) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println("Discount: " + d.applyDiscount());
                System.out.println(d.getDiscountDetails());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //  For Veg item
        FoodItem item1 = new VegItem();
        item1.setItemName("Paneer Burger");
        item1.setPrice(150);
        item1.setQuantity(2);

        // For SNon-veg item
        FoodItem item2 = new NonVegItem();
        item2.setItemName("Chicken Pizza");
        item2.setPrice(300);
        item2.setQuantity(1);

        // Order list
        List<FoodItem> order = new ArrayList<>();
        order.add(item1);
        order.add(item2);

        // Process order
        processOrder(order);
    }
}
