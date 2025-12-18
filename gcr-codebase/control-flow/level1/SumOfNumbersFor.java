// Java program to find the sum of n natural numbers using for loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 


import java.util.Scanner ;
public class SumOfNumbersFor{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating variable and taking user input of number n
		int number = Sc.nextInt();

		//Calculating sum using formula
		int sumUsingFormula = (number*(number+1))/2;

		//Calculating sum using for loop
		int sumUsingFor = 0;
		for(int i =number; i>0 ;i--){
			sumUsingFor += i;
		}

		//displaying the result
		System.out.println("The sum of n natural numbers using formula is "+sumUsingFormula+ " and using for loop is "+ sumUsingFor);


	}
}	
