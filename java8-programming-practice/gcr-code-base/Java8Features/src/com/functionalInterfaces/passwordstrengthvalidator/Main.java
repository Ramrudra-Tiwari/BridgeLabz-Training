package com.functionalInterfaces.passwordstrengthvalidator;

public class Main {

	public static void main(String[] args) {
		String password = "arvind@123";
		if(SecurityUtils.isPasswordValid(password)) {
			System.out.println("Password strong");
		}else {
			System.out.println("Password not valid");
		}
	}
}