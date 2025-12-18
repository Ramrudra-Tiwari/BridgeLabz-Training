// Java program to find factorial of a number using for loop
import java.util.Scanner ;
public class FactorialUsingFor{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating variable for number taking user input
		int number = Sc.nextInt();


		//Calculating factorial
		int answer = 1;
		for(int i = 1 ; i<=number ;i++){
			answer *=i;
		}

		//displaying the result
		System.out.println("The factorial of " +number + " is " + answer);

	}
}	
