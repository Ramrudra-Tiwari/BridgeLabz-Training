package com.encapsulationandpolymorphism.ecommerceplatform;

//making  main class to  demonstrating polymorphism
public class ECommerceMain {

    public static void main(String[] args) {

        // Electronics product
        Product p1 = new Electronics();
        p1.setProductId(1);
        p1.setName("Laptop");
        p1.setPrice(60000);
        p1.displayProduct();

        Taxable t1 = (Taxable) p1;
        System.out.println("Tax: " + t1.calculateTax());
        System.out.println(t1.getTaxDetails());

        System.out.println();

        // Clothing product
        Product p2 = new Clothing();
        p2.setProductId(2);
        p2.setName("T-Shirt");
        p2.setPrice(1000);
        p2.displayProduct();

        Taxable t2 = (Taxable) p2;
        System.out.println("Tax: " + t2.calculateTax());
        System.out.println(t2.getTaxDetails());

        System.out.println();

        // Groceries product
        Product p3 = new Groceries();
        p3.setProductId(3);
        p3.setName("Rice");
        p3.setPrice(500);
        p3.displayProduct();
    }
}
