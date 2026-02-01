package com.regexjunit.junitquestions.testingexceptionhandling;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Main {
	Divide d = new Divide();
	
	@Test
	void divide() {
		try {
			assertEquals(10,d.divide(100, 10));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}