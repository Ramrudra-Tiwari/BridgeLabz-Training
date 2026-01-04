package com.vehiclerentalapplication;

//Creating an  Customer class
public class Customer {

    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void showCustomerDetails() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + name);
    }
}
