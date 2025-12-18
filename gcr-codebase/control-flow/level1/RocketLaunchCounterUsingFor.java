// A program to count down the number from the user input value to 1 using a while loop for a rocket launch

import java.util.Scanner;
public class RocketLaunchCounterUsingFor {
		public static void main (String [] args)
		{

			//Defining the scanner object to take user input
			Scanner input = new Scanner(System.in);

			//get input value Rocket Launcher Counter
			System.out.println("Enter the number counter");
			int numberCounter = input.nextInt();

			//waiting for launch rocket 

			for (int i = numberCounter ; i>0 ;i--)
				{	
					System.out.println(i);
					if(i==1)
						{
							System.out.println("Rocket launched");
							break;
						}
				}
			input.close();
		}
}
