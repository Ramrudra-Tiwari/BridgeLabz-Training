package com.regexjunit.validatecreditcard;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("Visa Card-> 'V': ");
			System.out.println("Master Card-> 'M': ");
			System.out.println("Exit-> Enter 'E': ");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E') {
				break;
			}
			
			switch(c) {
				case 'V':
					System.out.println("Enter card number: ");
					String visa = sc.nextLine();
					
					
					System.out.println(visa.matches("^[4]\\d{15}$"));
					break;
				case 'M':
					System.out.println("Enter card number: ");
					String master = sc.nextLine();
					
					
					System.out.println(master.matches("^[5]\\d{15}$"));
					break;
				default:
					System.out.println("Invalid input!");
					break;
			}
		}
	}
}