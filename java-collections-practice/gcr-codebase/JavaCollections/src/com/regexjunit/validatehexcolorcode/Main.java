package com.regexjunit.validatehexcolorcode;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			System.out.println("Color Code Validate-> 'H': ");
			System.out.println("Exit-> Enter 'E': ");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			sc.nextLine();
			
			if(c=='E') {
				break;
			}
			
			switch(c) {
				case 'H':
					System.out.println("Enter HEX Code: ");
					String s = sc.nextLine();
					
					
					System.out.println(s.matches("^#[a-zA-Z0-9]{6}$"));
					break;
				default:
					System.out.println("Invalid input!");
					break;
			}
		}
	}
}