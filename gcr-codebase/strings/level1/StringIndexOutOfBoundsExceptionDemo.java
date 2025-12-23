public class StringIndexOutOfBoundsExceptionDemo{

	// Method to generate NullPointerException
	public static void generateException() {
		String text = "Hello";
		// This will generate NullPointerException
		System.out.println(text.charAt(9));
	}

	// Method to handle NullPointerException
	public static void handleException() {
		String text = "Hello";
		try {
			generateException();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException handled using try-catch block");
		}
	}

	public static void main(String[] args) {

		// Calling method to generate exception
		// generateException();  

		// Refactored code to handle exception
		handleException();
	}
}
