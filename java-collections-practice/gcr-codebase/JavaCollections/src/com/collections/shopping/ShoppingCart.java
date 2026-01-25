package com.collections.shopping;

import java.util.*;

public class ShoppingCart {

    private HashMap<String, Integer> priceMap = new HashMap<>();
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    public void addProduct(String name, int price) {
        priceMap.put(name, price);
        System.out.println("Product added.");
    }

    public void addToCart(String product) {
        if (priceMap.containsKey(product)) {
            cart.put(product, priceMap.get(product));
            System.out.println("Added to cart.");
        } else {
            System.out.println("Product not found!");
        }
    }

    public void showCart() {
        System.out.println("Cart Items:");
        System.out.println(cart);
    }

    public void showSortedByPrice() {
        TreeMap<Integer, String> sorted = new TreeMap<>();
        for (Map.Entry<String, Integer> e : cart.entrySet()) {
            sorted.put(e.getValue(), e.getKey());
        }
        System.out.println("Sorted by Price:");
        System.out.println(sorted);
    }
}
