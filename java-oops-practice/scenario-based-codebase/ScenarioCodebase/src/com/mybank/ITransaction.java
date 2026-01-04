package com.mybank;

//Firstly Creating an  Interface for transactions
public interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
