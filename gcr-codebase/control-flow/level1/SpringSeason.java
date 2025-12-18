//A program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.

import java.util.Scanner;
public class SpringSeason {
		public static void main (String [] args)
		{

			//Defining the scanner object to take user input
			Scanner input = new Scanner(System.in);

			//get input value for date and month
			System.out.println("Enter the Date");
			int date = input.nextInt();

			System.out.println("Enter the Month");
			int month = input.nextInt();


			//checking the Date and Month 
			if ((month == 3 && date >= 20 ) || (month == 6 && date <= 20) || (month ==4 || month ==5 ))
			{
				System.out.println("Its a Spring Season");
			}
			else
			{
				System.out.println("Not a Spring Season");
			}
			input.close();
		}
}