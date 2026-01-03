package com.encapsulationandpolymorphism.bankingsystem;

//Creating  SavingsAccount class
public class SavingsAccount extends BankAccount implements Loanable {

    // Interest calculation for savings account
    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }

    // Apply for loan
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for Savings Account: " + amount);
    }

    // Loan eligibility calculation
    @Override
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}
