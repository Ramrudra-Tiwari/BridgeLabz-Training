//Create a program to print odd and even numbers between 1 to the number entered by the user.
import java.util.Scanner ;
public class SumEvenOdd{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);


		// Creating variables to store the value of number given by user
		int num = Sc.nextInt();

		// Checking if the number is natural or not
		if(num>0){
			for(int i = 1 ; i<=num;i++){
				if(i%2==0){
					System.out.println("The number "+i+" is an Even number");
				}
				else{
					System.out.println("The number "+i+" is an Odd number");

				}
			}

		}
	}
}	
