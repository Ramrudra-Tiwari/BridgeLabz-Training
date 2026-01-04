package com.mybank;

// Creating an Savings that Extends  account class
public class SavingsAccount extends Account {

    private double interestRate = 4.0;

    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public double calculateInterest() {
        double interest = checkBalance() * interestRate / 100;
        return interest;
    }
}
