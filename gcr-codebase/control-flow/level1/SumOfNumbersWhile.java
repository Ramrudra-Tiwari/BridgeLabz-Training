// Java program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 


import java.util.Scanner ;
public class SumOfNumbersWhile{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating variable and taking user input of number n
		int number = Sc.nextInt();

		//Calculating sum using formula
		int sumUsingFormula = (number*(number+1))/2;

		//Calculating sum using while loop
		int sumUsingWhile = 0;
		while(number >0){
			sumUsingWhile += number;
			number--;
		}

		//displaying the result
		System.out.println("The sum of n natural numbers using formula is "+sumUsingFormula+ " and using while loop is "+ sumUsingWhile);


	}
}	
