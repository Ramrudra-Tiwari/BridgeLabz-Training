package com.smartcheckout;

import java.util.*;

public class Supermarket {

    // queue for customers
    private Queue<Customer> customerQueue = new LinkedList<>();

    // item -> price
    private HashMap<String, Integer> priceMap = new HashMap<>();

    // item -> stock
    private HashMap<String, Integer> stockMap = new HashMap<>();

    public Supermarket() {
        // sample items
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 40);
        priceMap.put("Rice", 60);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Rice", 15);
    }

    // add customer to queue
    public void addCustomer(Customer customer) {
        customerQueue.add(customer);
        System.out.println(customer.getName() + " added to billing queue.");
    }

    // process next customer
    public void processCustomer() {

        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        int totalBill = 0;

        System.out.println("\nBilling for: " + customer.getName());

        for (String item : customer.getItems()) {

            if (!priceMap.containsKey(item)) {
                System.out.println(item + " not available.");
                continue;
            }

            int stock = stockMap.get(item);

            if (stock <= 0) {
                System.out.println(item + " is out of stock.");
                continue;
            }

            int price = priceMap.get(item);
            totalBill += price;
            stockMap.put(item, stock - 1);

            System.out.println(item + " - ₹" + price);
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }

    // show queue status
    public void showQueue() {
        System.out.println("\nCustomers in Queue:");
        for (Customer c : customerQueue) {
            System.out.println("- " + c.getName());
        }
    }
}
