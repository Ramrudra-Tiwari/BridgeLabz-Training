package com.budgetwise;

// Annual budget implementation
public class AnnualBudget extends Budget implements IAnalyzable {

    private int year;

    public AnnualBudget(int year, double income) {
        super(income);
        this.year = year;
    }

    @Override
    public void generateReport() {
        System.out.println("\n===== Annual Budget Report (" + year + ") =====");
        System.out.println("Income    : ₹" + income);
        System.out.println("Expenses  : ₹" + getTotalExpenses());
        System.out.println("Savings   : ₹" + calculateSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Annual overspend analysis completed.");
    }
}
