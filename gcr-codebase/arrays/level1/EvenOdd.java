// Java  program to save odd and even numbers into odd and even arrays 
import java.util.Scanner ;
public class EvenOdd{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = Sc.nextInt();

		if(number>0){
			// Creating an arrays
			int size = number / 2 + 1 ;

			int even[] = new int[size];
			int odd[] = new int[size];

			// Storing elements inside the arrays
			int oddcounter = 0;
			int evencounter = 0;
			
			for(int i = 1 ; i<=number ; i++){
				if(i%2==0){
					even[evencounter++] = i;
				}
				else{
					odd[oddcounter++] = i;
				}
			}

			System.out.print("The elements of even array are : ");
			for(int val : even ){
				System.out.print(val + " ");
			}

			System.out.print("\nThe elements of odd array are : ");
			for(int val : odd ){
				System.out.print(val + " ");
			}




		}
		else{
			System.out.print("Error!!!!!");
		}


		// Closing the scanner
		Sc.close();
	}
}	



