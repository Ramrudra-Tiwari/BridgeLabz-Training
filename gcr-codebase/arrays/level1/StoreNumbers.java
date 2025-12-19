
import java.util.Scanner ;
public class StoreNumbers{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating an array
		int arr[] = new int[10];

		// Taking the user input of array
		System.out.println("Enter the elements of the array : ");
		for(int i = 0 ; i<10 ; i++){
			int val = Sc.nextInt();
			if(val<1){
				
				System.out.println("You have entered a negative number..");
				break;
			}
			arr[i] = val;

		}

		// Calculating sum and Displaying the output 
		int sum = 0;
		System.out.println("The numbers are : ");
		for(int a : arr){
			sum+=a;
			System.out.print(a + " ");
		}
		System.out.println("\nThe sum of the given number is : " + sum); 

		






		// Closing the scanner
		Sc.close();
	}
}	



