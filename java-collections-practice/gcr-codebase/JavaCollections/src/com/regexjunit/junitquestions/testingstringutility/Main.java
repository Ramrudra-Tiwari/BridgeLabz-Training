package com.regexjunit.junitquestions.testingstringutility;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class Main {
	StringUtils string = new StringUtils();
	
	@Test
	void matchReverse() {
		assertEquals("fdsa",string.reverse("asdf"));
	}
	
	@Test
	void palindrome() {
		assertEquals(true,string.isPalindrome("aaccaa"));
	}
	
	@Test
	void uppercase() {
		assertEquals("ASDF",string.toUpperCase("asdf"));
	}
}