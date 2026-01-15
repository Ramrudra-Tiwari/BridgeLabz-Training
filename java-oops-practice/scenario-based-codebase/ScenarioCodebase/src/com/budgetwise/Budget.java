package com.budgetwise;

import java.util.*;

// Base budget class demonstrating encapsulation
public class Budget {

    protected double income;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income) {
        this.income = income;
        categoryLimits = new HashMap<>();
        transactions = new ArrayList<>();
    }

    // Controlled access to add transaction
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void setCategoryLimit(String category, double limit) {
        categoryLimits.put(category, limit);
    }

    protected double getTotalExpenses() {
        double total = 0;
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Calculates savings using income - expenses
    public double calculateSavings() {
        return income - getTotalExpenses();
    }
}
