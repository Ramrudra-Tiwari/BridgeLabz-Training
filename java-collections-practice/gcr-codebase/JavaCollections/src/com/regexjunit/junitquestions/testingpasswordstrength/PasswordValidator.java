package com.regexjunit.junitquestions.testingpasswordstrength;

public class PasswordValidator {
	public boolean validate(String password) {
		String regex = "^(?=.*[A_Z])(?=.*\\d)[a-zA-Z0-9]{8,}$";
		return password.matches(regex);
	}
}