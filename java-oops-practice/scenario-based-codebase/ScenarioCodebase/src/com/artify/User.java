package com.artify;

// User / Buyer details
public class User {

    private String name;
    private double walletBalance; // encapsulated

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    // Balance deduct logic
    protected boolean deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
            return true;
        }
        System.out.println("❌ Insufficient wallet balance");
        return false;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getName() {
        return name;
    }
}
