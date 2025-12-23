import java.util.Scanner;

public class ConvertToUpperCase {

	// Method to convert string to uppercase using charAt() and ASCII logic
	public static String convertToUpperCase(String text) {
		char[] result = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			// ASCII of 'a' = 97, 'A' = 65 (difference = 32)
			if (ch >= 'a' && ch <= 'z') {
				result[i] = (char) (ch - 32);
			} else {
				result[i] = ch;
			}
		}

		return new String(result);
	}

	// Method to compare two strings using charAt()
	public static boolean compareStrings(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking complete text input
		System.out.print("Enter text: ");
		String inputText = sc.nextLine();

		// Using built-in toUpperCase()
		String builtInUpper = inputText.toUpperCase();

		// Using user-defined method
		String manualUpper = convertToUpperCase(inputText);

		// Comparing both results
		boolean isSame = compareStrings(builtInUpper, manualUpper);

		// Displaying results
		System.out.println("Uppercase using built-in method: " + builtInUpper);
		System.out.println("Uppercase using manual method: " + manualUpper);
		System.out.println("Are both results equal? " + isSame);

		sc.close();
	}
}
