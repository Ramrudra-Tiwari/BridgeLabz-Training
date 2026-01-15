package com.budgetwise;

import java.util.HashMap;
import java.util.Map;

// Monthly budget implementation
public class MonthlyBudget extends Budget implements IAnalyzable {

    private String month;

    public MonthlyBudget(String month, double income) {
        super(income);
        this.month = month;
    }

    @Override
    public void generateReport() {
        System.out.println("\n----- Monthly Budget Report (" + month + ") -----");
        System.out.println("Income      : ₹" + income);
        System.out.println("Expenses    : ₹" + getTotalExpenses());
        System.out.println("Savings     : ₹" + calculateSavings());
    }

    @Override
    public void detectOverspend() {

        Map<String, Double> spentMap = new HashMap<>();

        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase("expense")) {
                spentMap.put(
                        t.getCategory(),
                        spentMap.getOrDefault(t.getCategory(), 0.0) + t.getAmount()
                );
            }
        }

        System.out.println("\nOverspending Status:");
        for (String category : categoryLimits.keySet()) {
            if (spentMap.getOrDefault(category, 0.0) > categoryLimits.get(category)) {
                System.out.println("⚠ Overspent in category: " + category);
            }
        }
    }
}
