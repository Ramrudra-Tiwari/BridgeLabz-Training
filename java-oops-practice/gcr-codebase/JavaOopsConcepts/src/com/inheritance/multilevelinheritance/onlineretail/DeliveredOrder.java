package com.inheritance.multilevelinheritance.onlineretail;
// Subclass of ShippedOrder
public class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
