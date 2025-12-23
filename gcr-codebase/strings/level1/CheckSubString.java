import java.util.Scanner;

public class CheckSubString{

	public static void main(String[] args) {
		// Creating scanner to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating variable and taking user input of 2 strings
		System.out.print("Enter String 1 : ");
		String str1 = Sc.nextLine().trim();

		System.out.print("Enter Starting number : ");
		int start = Sc.nextInt();
		System.out.print("Enter Ending number : ");
		int end = Sc.nextInt();

		String strUsingCharAt = "";

		String strUsingSubstr = str1.substring(start,end) ;

		
		
		while( start < end) {
			strUsingCharAt+=str1.charAt(start++);
		}
		

		

		// Final decision
		if (strUsingCharAt.equals(strUsingSubstr)) {
			System.out.println("The given strings " + strUsingCharAt + " and " + strUsingSubstr + " are equal.");
		} else {
			System.out.println("The given strings " + strUsingCharAt + " and " + strUsingSubstr + " are not equal.");
		}
	}
}
