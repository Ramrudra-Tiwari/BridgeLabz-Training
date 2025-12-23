import java.util.Scanner;

public class NumberFormatExceptionDemo {

	// Method to generate NumberFormatException
	public static void generateException(String text) {
		// This will generate NumberFormatException if text is not numeric
		int number = Integer.parseInt(text);
		System.out.println("Converted number: " + number);
	}

	// Method to handle NumberFormatException
	public static void handleException(String text) {
		try {
			int number = Integer.parseInt(text);
			System.out.println("Converted number: " + number);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException handled: Input is not a valid number");
		} catch (RuntimeException e) {
			System.out.println("Generic RuntimeException handled");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Taking user input as String
		System.out.print("Enter a value: ");
		String text = sc.nextLine();

		// Calling method to generate exception
		// generateException(text);  

		// Calling method to handle exception
		handleException(text);

		sc.close();
	}
}
