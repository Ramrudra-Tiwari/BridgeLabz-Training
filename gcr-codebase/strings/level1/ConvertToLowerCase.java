import java.util.Scanner;

public class ConvertToLowerCase {

	// Method to convert string to lowercase using charAt() and ASCII logic
	public static String convertToLowerCase(String text) {
		char[] result = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			// ASCII of 'A' = 65, 'a' = 97 (difference = 32)
			if (ch >= 'A' && ch <= 'Z') {
				result[i] = (char) (ch + 32);
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

		// Using built-in toLowerCase()
		String builtInLower = inputText.toLowerCase();

		// Using user-defined method
		String manualLower = convertToLowerCase(inputText);

		// Comparing both results
		boolean isSame = compareStrings(builtInLower, manualLower);

		// Displaying results
		System.out.println("Lowercase using built-in method: " + builtInLower);
		System.out.println("Lowercase using manual method: " + manualLower);
		System.out.println("Are both results equal? " + isSame);

		sc.close();
	}
}
