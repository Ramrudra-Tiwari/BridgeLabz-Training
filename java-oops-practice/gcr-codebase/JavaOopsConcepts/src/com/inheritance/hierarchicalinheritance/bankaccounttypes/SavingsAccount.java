package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
