// Java program to find factorial of a number using while loop
import java.util.Scanner ;
public class FactorialUsingWhile{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating variable for number taking user input
		int number = Sc.nextInt();
		int value = number;

		//Calculating factorial
		int answer = 1;
		while(value>0){
			answer = answer * value;
			value --;
		}

		//displaying the result
		System.out.println("The factorial of " +number + " is " + answer);

	}
}	
