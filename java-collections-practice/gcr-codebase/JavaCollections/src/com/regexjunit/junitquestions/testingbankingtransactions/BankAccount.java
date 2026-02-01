package com.regexjunit.junitquestions.testingbankingtransactions;

public class BankAccount {
	
	static double balance = 2000;
	
	public boolean deposit(double amount) {
		if(amount<=0) {
			return false;
		}
		
		balance+=amount;
		return true;
	}
	
	public boolean withdraw(double amount) {
		if(amount<=0 || amount>balance) {
			return false;
		}
		
		balance-=amount;
		return true;
	}
	
	public double getBalance(){
		return balance;
	}
}