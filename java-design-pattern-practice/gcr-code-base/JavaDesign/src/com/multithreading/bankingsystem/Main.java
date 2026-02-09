package com.multithreading.bankingsystem;

public class Main {

	public static void main(String[] args) {
		
		Thread customer1 = new Thread(new Transaction(3000, new BankAccount()));
		customer1.setName("Customer 1");
		
		Thread customer2 = new Thread(new Transaction(7001, new BankAccount()));
		customer1.setName("Customer 2");
		
		customer1.start();
		customer2.start();
	}
}