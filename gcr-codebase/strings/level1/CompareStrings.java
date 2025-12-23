import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// Creating scanner to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating variable and taking user input of 2 strings
		System.out.print("Enter String 1 : ");
		String str1 = Sc.nextLine().trim();

		System.out.print("Enter String 2 : ");
		String str2 = Sc.nextLine().trim();

		boolean isEqualUsingCharAt = true;

		// Length check 
		if (str1.length() != str2.length()) {
			isEqualUsingCharAt = false;
		} else {
			for (int index = 0; index < str1.length(); index++) {
				if (str1.charAt(index) != str2.charAt(index)) {
					isEqualUsingCharAt = false;
					break;
				}
			}
		}

		boolean isEqualUsingEquals = str1.equals(str2);

		// Final decision
		if (isEqualUsingCharAt && isEqualUsingEquals) {
			System.out.println("The given strings " + str1 + " and " + str2 + " are equal.");
		} else {
			System.out.println("The given strings " + str1 + " and " + str2 + " are not equal.");
		}
	}
}
