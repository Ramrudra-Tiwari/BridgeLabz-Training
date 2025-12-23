

public class ArrayIndexOutOfBoundsExceptionDemo{

	// Method to generate ArrayIndexOutOfBoundsException
	public static void generateException() {
		// This will generate ArrayIndexOutOfBoundsException if text is not numeric
		int number[] = new int[10];
		System.out.println("Number: " + number[23]);
	}

	// Method to handle ArrayIndexOutOfBoundsException
	public static void handleException() {
		try {
			generateException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		} catch (RuntimeException e) {
			System.out.println("Generic RuntimeException handled");
		}
	}

	public static void main(String[] args) {

		

		// Calling method to generate exception
		// generateException(text);  

		// Calling method to handle exception
		handleException();

	
	}
}
