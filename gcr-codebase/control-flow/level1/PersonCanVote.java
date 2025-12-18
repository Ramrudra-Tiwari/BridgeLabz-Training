//A program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

import java.util.Scanner;
public class PersonCanVote{
	public static void main(String[] args ){

		//Create a scanner for taking inputs 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter person's age");

		//taking number input
		int age = input.nextInt();

		//checking age is greater than 18 
		if (age>=18)
			{
				System.out.println("The Person's Age is " +age+ " and can vote.");
			}
		else
			{	
				System.out.println("The person's age is " +age+ " and cannot vote.");
			}
		input.close();
	}
}