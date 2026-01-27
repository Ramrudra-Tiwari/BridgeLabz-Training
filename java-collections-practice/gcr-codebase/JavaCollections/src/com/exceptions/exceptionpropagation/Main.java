package com.exceptions.exceptionpropagation;

public class Main {

	public static void main(String[] args) {
		try {
			method2();
		}
		catch(ArithmeticException e) {
			System.out.println("Hanlde exception.");
		}
	}
	
	//method 1
	public static void method1() {
		System.out.println(10/0);
	}
	
	//method 2
	public static void method2() {
		method1();
	}
}