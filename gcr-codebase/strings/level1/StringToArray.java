import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
		// Creating scanner to take user input
		Scanner Sc = new Scanner(System.in);

		// Creating variable and taking user input of string
		System.out.print("Enter a String : ");
		String str1 = Sc.nextLine().trim();

		int len = str1.length();

		// Using toCharArray()
		char[] charArrayTo = str1.toCharArray();

		// Without using toCharArray()
		char[] charArrayNTo = new char[len];
		for (int i = 0; i < len; i++) {
			charArrayNTo[i] = str1.charAt(i);
		}

		System.out.print("Using toCharArray(): ");
		for (char c : charArrayTo) {
			System.out.print(c + " ");
		}

		System.out.print("\nWithout using toCharArray(): ");
		for (char c : charArrayNTo) {
			System.out.print(c + " ");
		}
	}
}

