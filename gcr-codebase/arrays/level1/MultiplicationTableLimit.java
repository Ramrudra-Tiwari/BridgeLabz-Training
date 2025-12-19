// a program to print a multiplication table of a number.

import java.util.Scanner ;
public class MultiplicationTableLimit{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating an array
		int arr[] = new int[10];

		// Taking the user input of number
		System.out.print("Enter a number : ");
		int val = Sc.nextInt();
		if(val>5 && val<10){
			// Calculating table
			for(int i=0 ; i<10 ; i++){
				arr[i] = val*(i+1);
			}

			//Displaying the output
			int a = 1;
			for(int num : arr){
				System.out.println(val +" * "+ a + " = " + num);
			}
		
		}
		else{
			System.out.println("You have entered out of range number.");
		}

		// Closing the scanner
		Sc.close();
	}
}	



