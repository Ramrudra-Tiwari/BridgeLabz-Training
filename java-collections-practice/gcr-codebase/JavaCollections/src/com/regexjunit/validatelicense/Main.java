package com.regexjunit.validatelicense;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("License Validate-> 'L': ");
			System.out.println("Exit-> Enter 'E': ");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E') {
				break;
			}
			
			switch(c) {
				case 'L':
					System.out.println("Enter License: ");
					String s = sc.nextLine();
				
					System.out.println(s.matches("^[A-Z]{2}[0-9]{4}$"));
					break;
				default:
					System.out.println("Invalid input!");
					break;
			}
		}
	}
}
/*Validate a License Plate Number
 *License plate format: Starts with two Upper case letters, followed by four digits.
 *Example: "AB1234" is valid, but "A12345" is invalid 
 */