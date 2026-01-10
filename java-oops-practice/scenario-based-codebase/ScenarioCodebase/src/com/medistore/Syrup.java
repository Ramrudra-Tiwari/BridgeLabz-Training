package com.medistore;

import java.time.LocalDate;

// Syrup → liquid medicine
public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    // Liquids expire faster (extra safety check)
    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate.minusDays(5));
    }
}
