package com.ewalletapplication;

import java.util.ArrayList;

//Creating  Abstract wallet class
public abstract class Wallet implements Transferrable {

    private double balance; // Encapsulation
    protected ArrayList<Transaction> history = new ArrayList<>();

    // Creating Constructor with optional referral bonus
    public Wallet(boolean referralBonus) {
        if (referralBonus) {
            balance = 100; // bonus
            history.add(new Transaction("Referral Bonus", 100));
        }
    }

    // For Load money
    public void loadMoney(double amount) {
        balance += amount;
        history.add(new Transaction("Money Loaded", amount));
    }

    // For Protected balance deduction
    protected void deduct(double amount) {
        balance -= amount;
    }

    // For Getter for balance
    public double getBalance() {
        return balance;
    }

    // Show transaction history
    public void showHistory() {
        for (Transaction t : history) {
            t.showTransaction();
        }
    }
}
