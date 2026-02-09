package com.multithreading.bankingsystem;

public class Transaction implements Runnable{

	private double amount;
	BankAccount bankaccount;
	
	public Transaction(double amount, BankAccount bankaccount) {
		this.amount = amount;
		this.bankaccount = bankaccount;
	}

	@Override
	public void run() {
		bankaccount.withdraw(amount);
	}
}