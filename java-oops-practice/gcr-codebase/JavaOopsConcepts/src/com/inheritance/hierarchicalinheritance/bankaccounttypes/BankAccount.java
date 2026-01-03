package com.inheritance.hierarchicalinheritance.bankaccounttypes;

public class BankAccount {

    protected int accountNumber;
    protected double balance;

    public void setDetails(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
