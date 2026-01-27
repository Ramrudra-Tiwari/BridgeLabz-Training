package com.exceptions.uncheckedexception;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number: ");
			int n1 = sc.nextInt();
			System.out.println("Enter the second number: ");
			int n2 = sc.nextInt();
			
			try {
				System.out.println("first number divide by second number is: "+(n1/n2));
			}
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception!");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Input miss match exceptions");
		}
	}
}