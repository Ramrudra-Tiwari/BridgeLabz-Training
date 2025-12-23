import java.util.Scanner;

public class StringLengthWithoutLength {

	// Method to find string length without using length()
	public static int findStringLength(String text) {
		int count = 0;

		while (true) {
			try {
				text.charAt(count);
				count++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking user input using next()
		System.out.print("Enter a string: ");
		String inputText = sc.next();

		// Calling user-defined method
		int manualLength = findStringLength(inputText);

		// Calling built-in length() method
		int builtInLength = inputText.length();

		// Displaying results
		System.out.println("Length without using length(): " + manualLength);
		System.out.println("Length using built-in length(): " + builtInLength);

		sc.close();
	}
}
