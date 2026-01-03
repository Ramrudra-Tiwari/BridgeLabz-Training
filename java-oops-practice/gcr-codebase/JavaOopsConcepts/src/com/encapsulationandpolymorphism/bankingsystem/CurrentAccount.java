package com.encapsulationandpolymorphism.bankingsystem;

// CurrentAccount class
public class CurrentAccount extends BankAccount {

    // Interest calculation for current account
    @Override
    public double calculateInterest() {
        return balance * 0.01;
    }
}
