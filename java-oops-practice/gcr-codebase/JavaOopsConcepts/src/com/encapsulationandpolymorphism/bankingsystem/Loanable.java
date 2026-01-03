package com.encapsulationandpolymorphism.bankingsystem;

// Interface for loan related operations
public interface Loanable {

    void applyForLoan(double amount);

    double calculateLoanEligibility();
}
