package com.regexjunit.validateIPaddress;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("IP Address Validate-> 'P': ");
			System.out.println("Exit-> Enter 'E': ");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E') {
				break;
			}
			
			switch(c) {
				case 'P':
					System.out.println("Enter IP: ");
					String s = sc.nextLine();
					
					String regex = "^\\d{1,3}(\\.\\d{1,3}){3}$";
					System.out.println(s.matches(regex));
					break;
				default:
					System.out.println("Invalid input!");
					break;
			}
		}
	}
}