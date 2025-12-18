//a program to check if the first, second, or third number is the largest of the three.
import java.util.Scanner;
public class LargestOfThree {
	public static void main(String[] args ){

		//Create a scanner for atking inputs 
		Scanner input = new Scanner(System.in);
   
		//taking number input
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();

		//checking is the first number is smallest or not 
		System.out.println ("Is the first number the largest? "+(number1>number2 && number1>number3));
		System.out.println ("Is the first number the largest? "+(number2>number3 && number2>number3));
		System.out.println ("Is the first number the largest? "+(number3>number1 && number3>number2));
	}
}

