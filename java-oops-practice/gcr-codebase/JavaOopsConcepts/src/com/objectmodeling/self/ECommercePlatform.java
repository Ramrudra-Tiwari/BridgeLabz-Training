package com.objectmodeling.self;


public class ECommercePlatform {
    public static void main(String[] args) {

        // Create Products
        Product p1 = new Product(101, "Laptop", 800.00);
        Product p2 = new Product(102, "Mouse", 35.00);
        Product p3 = new Product(103, "Keyboard", 55.00);

        // Create Customer
        Customer customer = new Customer(1, "Vishal");

        // Create Order
        Order order1 = new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        // Customer places order
        customer.placeOrder(order1);

        // View customer orders
        customer.viewOrders();
    }
}
