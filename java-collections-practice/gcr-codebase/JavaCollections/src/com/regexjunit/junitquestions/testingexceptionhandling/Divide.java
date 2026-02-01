package com.regexjunit.junitquestions.testingexceptionhandling;

public class Divide {
	public int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("Can't divide by zero");
		}
		return a/b;
	}
}