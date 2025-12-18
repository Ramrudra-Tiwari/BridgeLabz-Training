//This is the program to check if a number is divisible by 5 
import java.util.Scanner;

class NumberIsDivisibleBy5 {
	public static void main(String [] args) {
		//Defining the Scanner object to take user input 
		Scanner input = new Scanner(System.in);

		//taking the input number
		System.out.println("Enter a number :");
		int origNumber = input.nextInt();
		
		//if number is divisible by 5 result is true 
		if (origNumber % 5 == 0) {
			System.out.println ("Is the number " +origNumber+ "divisible by 5 ? Yes");
		}
		}
}
