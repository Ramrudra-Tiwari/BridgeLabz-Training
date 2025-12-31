package com.objectmodeling.self;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private List<Order> orders;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed a new order.");
    }

    public void viewOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.showOrderDetails();
            System.out.println("------------------");
        }
    }
}
