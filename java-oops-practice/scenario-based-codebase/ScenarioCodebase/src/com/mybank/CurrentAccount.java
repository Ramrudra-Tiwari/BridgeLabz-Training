package com.mybank;

// Creating an Current account class that extends account 
public class CurrentAccount extends Account {

    private double interestRate = 1.5;

    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    public double calculateInterest() {
        double interest = checkBalance() * interestRate / 100;
        return interest;
    }
}
