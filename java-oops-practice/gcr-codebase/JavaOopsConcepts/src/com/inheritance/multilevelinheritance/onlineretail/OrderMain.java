package com.inheritance.multilevelinheritance.onlineretail;

public class OrderMain {

    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder();

        order.orderId = 5001;
        order.orderDate = "01-01-2026";
        order.trackingNumber = "T12";
        order.deliveryDate = "05-01-2026";

        System.out.println("Order ID: " + order.orderId);
        System.out.println("Order Date: " + order.orderDate);
        System.out.println("Tracking Number: " + order.trackingNumber);
        System.out.println("Delivery Date: " + order.deliveryDate);
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
