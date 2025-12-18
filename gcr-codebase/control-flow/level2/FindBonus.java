// Java program to find the bonuses of employees based on their years of service.


import java.util.Scanner ;
public class FindBonus{
	public static void main(String[] args){
		// creating Scanner Object to take user input
		Scanner Sc = new Scanner(System.in);

		// Taking user input of salary and years of service
		int Salary = Sc.nextInt();
		int ServiceYears = Sc.nextInt();

		// Calculating discount
		int Bonus = (Salary * ServiceYears ) /100;

		System.out.println("You will be having an extra bonus amount of rupees INR" +Bonus);





	}
}	
