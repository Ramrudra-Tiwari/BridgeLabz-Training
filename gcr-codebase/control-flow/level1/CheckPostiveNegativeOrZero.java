//A program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class CheckPostiveNegativeOrZero {
		public static void main (String [] args){

			//Defining the scanner object to take user input
			Scanner input = new Scanner(System.in);

			//get input value for number 
			int number = input.nextInt();

			//checking the number is positive ,negative , or Zero
			if (number==0)
			{
				System.out.println("The Number is Zero");
			}
			else if (number>0)
			{
				System.out.println("The Number " +number+ " is Positive");
			}
			else
			{
				System.out.println("the Number " +number+ " is Negative");
			}
			input.close();
		}
}