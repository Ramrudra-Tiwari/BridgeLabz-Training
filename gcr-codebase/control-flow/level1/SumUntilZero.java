//A program to find the sum of numbers until the user enters 

import java.util.Scanner;
public class SumUntilZero {
		public static void main (String [] args)
		{
			//Defining the scanner object to take user input
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("Enter a numbers (0 to stop):");

			double sum = 0;
		 

			while(true)
				{
					double number = input.nextDouble();
						
						if (number <= 0)
							{
								break;
							}
						else
							{
								sum+=number;
							}
							
						System.out.println("Enter Next Number (0 to stop):");
				}
						System.out.println("Sum = " + sum );
						input.close();
		}
}