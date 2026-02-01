package com.regexjunit.validateusername;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("Password Validate-> 'P': ");
			System.out.println("Exit-> Enter 'E': ");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E') {
				break;
			}
			
			switch(c) {
				case 'P':
					System.out.println("Enter password: ");
					String s = sc.nextLine();
					
					
					System.out.println(s.matches("^[a-zA-Z][a-zA-Z0-9_]{4,15}$"));
					break;
				default:
					System.out.println("Invalid input!");
					break;
			}
		}
	}
}
/*
 * Requirement-> Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_) 
 * must start with letter
 * at length should be 5 - 15
 */