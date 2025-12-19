
import java.util.Scanner ;
public class MeanHeight{

	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating an array
		double heights[] = new double[11];

		// Taking the user input of array
		System.out.print("Enter the elements of array : ");
		for(int i = 0 ; i<11 ; i++){
			double val = Sc.nextDouble();
			heights[i] = val;
		}
		double sum = 0;
		// calculating sum of heights
		for(double d : heights){
			sum += d;
		}

		double meanHeight =  sum/11;

		System.out.println("the mean height of the football team is "  + meanHeight);






		// Closing the scanner
		Sc.close();
	}
}	



