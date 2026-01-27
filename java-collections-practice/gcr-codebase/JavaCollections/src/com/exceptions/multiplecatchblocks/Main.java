package com.exceptions.multiplecatchblocks;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the index to get element: ");
			int idx = sc.nextInt();
			
			//case 1-
			int arr[] = {2,4,32,43,223,4332,22,324,3224,55,3563,26};
			
			//case 2-
//			int arr[] = null;
			System.out.println("Value at index "+(idx)+" is: "+(arr[idx]));
			sc.close();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index!");
		}
		catch(NullPointerException e) {
			System.out.println("Array Not intilize yet!");
		}
	}
}