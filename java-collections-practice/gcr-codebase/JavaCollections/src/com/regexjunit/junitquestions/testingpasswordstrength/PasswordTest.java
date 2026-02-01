package com.regexjunit.junitquestions.testingpasswordstrength;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

public class PasswordTest {
	PasswordValidator valid = new PasswordValidator();
	
	@Test
	void validate() {
		assertTrue(valid.validate("Arvind1283"));
	}
}