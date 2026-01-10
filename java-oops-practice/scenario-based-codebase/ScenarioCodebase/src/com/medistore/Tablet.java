package com.medistore;

import java.time.LocalDate;

// Tablet → preserved medicine
public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    // Polymorphism: tablets usually last longer
    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate);
    }
}
