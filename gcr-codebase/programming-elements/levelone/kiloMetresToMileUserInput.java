import java.util.Scanner;

public class kiloMetresToMileUserInput{
	public static void main(String[] args){

		// creating to variable to store distance in KM
		double km;

		// creating a scanner to take user input
		Scanner sc=new Scanner(System.in);

		// Taking user input of distance in kilomteres 
		km=sc.nextInt();

		// calculatig distance in miles
		double miles=km*1.6;

		// displaying the results
		System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
	}
}