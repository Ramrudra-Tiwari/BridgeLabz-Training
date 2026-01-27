package com.exceptions.banktransactionsystem;
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static double balance = 20000;
	public static void main(String[] args) {
		try {
			System.out.println("Enter the amount for withdraw: ");
			double amount = sc.nextDouble();
			
			withdraw(amount);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//withdraw method
	public static void withdraw(double amount) throws InsufficientBalanceException{
		if(amount>balance || amount<0) {
			throw new InsufficientBalanceException("Insufficient Balance!");
		}
		else {
			balance-=amount;
			System.out.println("Amount withdraw success.");
		}
	}
}