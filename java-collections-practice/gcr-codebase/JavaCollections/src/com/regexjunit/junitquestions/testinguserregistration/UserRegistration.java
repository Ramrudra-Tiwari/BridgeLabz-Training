package com.regexjunit.junitquestions.testinguserregistration;

public class UserRegistration {
	
	public boolean registerUser(String username, String email, String password) throws IllegalArgumentException {
		System.out.println("-------------Registration Done--------------");
		System.out.println("username: "+username);
		System.out.println("email: "+email);
		System.out.println("password: "+password);
		return true;
	}
}