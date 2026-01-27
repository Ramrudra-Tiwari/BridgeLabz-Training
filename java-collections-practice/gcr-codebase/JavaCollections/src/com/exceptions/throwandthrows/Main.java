package com.exceptions.throwandthrows;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			double result = calculateInterest();
			System.out.println(result);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static double calculateInterest() throws IllegalArgumentException {
		System.out.println("Enter amount: ");
		double amount = sc.nextDouble();
		if(amount<0) {
			throw new IllegalArgumentException("amout must be positive!");
		}
		
		System.out.println("Enter Rate: ");
		double rate = sc.nextDouble();
		if(rate<0) {
			throw new IllegalArgumentException("rate must be positive!");
		}
		
		System.out.println("Enter year: ");
		int year = sc.nextInt();
		
		
		return amount*rate*year;
	}
}