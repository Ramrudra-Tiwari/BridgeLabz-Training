package com.exceptions.customexception;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			
			validateAge(age);
			sc.close();
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void validateAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Invalid age! Please enter the valid age.");
		}else {
			System.out.println("Your age eligible for vote.");
		}
	}
}