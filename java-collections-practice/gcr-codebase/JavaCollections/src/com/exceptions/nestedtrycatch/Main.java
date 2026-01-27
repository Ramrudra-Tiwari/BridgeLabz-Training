package com.exceptions.nestedtrycatch;
import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			int arr[] = {14,4,4,3,24,432,4};
			System.out.println("Enter divisor: ");
			
			int divisor = sc.nextInt();
			
			System.out.println("Enter idx to divide: ");
			int idx = sc.nextInt();
			
			try {
				int a = arr[idx];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array out bound! please enter valid");
				return;
			}
			
			try {
				System.out.println(arr[idx]/divisor);
			}
			catch(ArithmeticException e) {
				System.out.println("Can't divide by zero!");
			}
		}
		finally {
			System.out.println("Operation done.");
		}
	}
}