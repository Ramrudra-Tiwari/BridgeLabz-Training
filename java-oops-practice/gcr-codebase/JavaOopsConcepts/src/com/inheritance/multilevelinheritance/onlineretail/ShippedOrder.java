package com.inheritance.multilevelinheritance.onlineretail;
// creating an Subclass of Order
public class ShippedOrder extends Order {

    String trackingNumber;

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
