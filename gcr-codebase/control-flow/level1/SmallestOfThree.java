// a program to check if the first is the smallest of the 3 numbers
import java.util.Scanner;

class SmallestOfThree{
	public static void main(String[]args){
		//Defining the scanner object to take user input
		Scanner input = new Scanner(System.in);

		//taking number input
		System.out.println("Enter Number 1:");
		int number1 = input.nextInt();

		//taking number input
		System.out.println("Enter Number 2:");
		int number2 = input.nextInt();

		//taking number input
		System.out.println("Enter Number 3:");
		int number3 = input.nextInt();
 
		//creating a checking variable 
		String temp = "False";

		//checking is the first number is smallest or not 
		if ( number1<number2 && number1<number3) 
		{
			temp="True";
		}

		System.out.println("Is the first number the smallest ? "+temp);
	}
}