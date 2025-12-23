import java.util.Scanner;

public class SplitTextWithoutSplit {

	// Method to find length of string without using length()
	public static int findLength(String text) {
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

	// Method to split text into words without using split()
	public static String[] manualSplit(String text) {
		int length = findLength(text);

		// Step 1: Count words
		int wordCount = 1;
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == ' ') {
				wordCount++;
			}
		}

		// Step 2: Store space indexes
		int[] spaceIndexes = new int[wordCount - 1];
		int index = 0;

		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == ' ') {
				spaceIndexes[index++] = i;
			}
		}

		// Step 3: Extract words
		String[] words = new String[wordCount];
		int start = 0;

		for (int i = 0; i < spaceIndexes.length; i++) {
			words[i] = text.substring(start, spaceIndexes[i]);
			start = spaceIndexes[i] + 1;
		}
		words[wordCount - 1] = text.substring(start);

		return words;
	}

	// Method to compare two string arrays
	public static boolean compareStringArrays(String[] arr1, String[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (!arr1[i].equals(arr2[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking complete text input
		System.out.print("Enter text: ");
		String text = sc.nextLine();

		// Using user-defined split method
		String[] manualWords = manualSplit(text);

		// Using built-in split() method
		String[] builtInWords = text.split(" ");

		// Comparing both results
		boolean result = compareStringArrays(manualWords, builtInWords);

		// Displaying result
		System.out.println("Are both split results equal? " + result);

		sc.close();
	}
}
