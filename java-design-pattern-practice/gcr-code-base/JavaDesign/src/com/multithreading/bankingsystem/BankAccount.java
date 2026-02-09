package com.multithreading.bankingsystem;

public class BankAccount {
	private double balance = 10000;


	public void withdraw(double amount) {
		
		if(balance>=amount && !(amount<=0)) {
			System.out.println("[ "+Thread.currentThread().getName() + "] Attempting to withdraw "+ amount);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			
			balance-=amount;
		}
		else {
			System.out.println("[ "+Thread.currentThread().getName() + "] Insufficent Amount!");
		}
	}
}