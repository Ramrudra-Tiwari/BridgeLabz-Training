// Create a program to convert the distance of 10.8 kilometers to miles.
// Hint: 1 km = 1.6 miles
// I/P => NONE
// O/P => The distance  ___ km in miles is ___

public class kiloMetresToMiles{
	public static void main(String[] args){

		// Create a variable kiloMetresDistance to indicate the distance in kilometres
		double kiloMetresDistance = 10.8;

		// Create a variable milesDistance to calculate distance in miles
		double milesDistance = kiloMetresDistance * 1.6;

		// displaying the results
		System.out.println("The distance "+kiloMetresDistance+" km in miles is "+ milesDistance);
	}
}