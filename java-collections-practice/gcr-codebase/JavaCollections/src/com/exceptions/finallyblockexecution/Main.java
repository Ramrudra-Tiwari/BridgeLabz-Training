package com.exceptions.finallyblockexecution;

import java.util.*;


public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		try {
			System.out.println("Enter first number: ");
			int n1 = sc.nextInt();
			
			System.out.println("Enter second number: ");
			int n2 = sc.nextInt();
			
			System.out.println(n1+"/"+n2+"= "+(n1/n2));

		} catch (ArithmeticException e) {
			System.out.println("can't divide by zero");
		}
		finally{
			System.out.println("Operation completed.");
		}
	}
}