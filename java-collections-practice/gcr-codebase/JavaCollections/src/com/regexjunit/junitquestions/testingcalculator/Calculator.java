package com.regexjunit.junitquestions.testingcalculator;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int substract(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Can't divide by zero");
		}
		return a/b;
	}
}