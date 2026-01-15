package com.budgetwise;

import java.util.Scanner;

// Main application class
public class BudgetWiseMain {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        showWelcome();

        System.out.print("Enter Month: ");
        String month = sc.nextLine();

        System.out.print("Enter Income: ₹");
        double income = sc.nextDouble();

        MonthlyBudget budget = new MonthlyBudget(month, income);

        setupCategories(budget);
        addTransactions(budget);
        showSummary(budget);

        System.out.println("\nThank you for using BudgetWise.");
        sc.close();
    }

    private static void showWelcome() {
        System.out.println("=================================");
        System.out.println("        BUDGETWISE SYSTEM         ");
        System.out.println("=================================");
    }

    private static void setupCategories(MonthlyBudget budget) {

        System.out.print("\nNumber of Categories: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Category Name: ");
            String name = sc.nextLine();

            System.out.print("Limit (₹): ");
            double limit = sc.nextDouble();
            sc.nextLine();

            budget.setCategoryLimit(name, limit);
        }
    }

    private static void addTransactions(MonthlyBudget budget) {

        System.out.print("\nNumber of Transactions: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= count; i++) {

            System.out.print("Amount: ₹");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.print("Type (income/expense): ");
            String type = sc.nextLine();

            System.out.print("Date: ");
            String date = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            budget.addTransaction(
                    new Transaction(amount, type, date, category)
            );
        }
    }

    private static void showSummary(MonthlyBudget budget) {

        System.out.println("\n=================================");
        System.out.println("          BUDGET SUMMARY          ");
        System.out.println("=================================");

        IAnalyzable report = budget; // Polymorphism
        report.generateReport();
        report.detectOverspend();
    }
}
