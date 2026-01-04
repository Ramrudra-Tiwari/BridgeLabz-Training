package com.mybank;

//Creating an  Base class
public abstract class Account implements ITransaction {

    protected String accountNumber;   // accessible to child classes
    private double balance;            // encapsulated

    // After that defining Constructor with opening balance
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //then taking  Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double checkBalance() {
        return balance;
    }

    // Method used by child classes in this 
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // At last using  Abstract method for polymorphism
    public abstract double calculateInterest();
}
