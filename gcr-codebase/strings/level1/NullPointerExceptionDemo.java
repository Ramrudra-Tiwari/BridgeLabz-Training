public class NullPointerExceptionDemo {

	// Method to generate NullPointerException
	public static void generateException() {
		String text = null;
		// This will generate NullPointerException
		System.out.println(text.length());
	}

	// Method to handle NullPointerException
	public static void handleException() {
		String text = null;
		try {
			System.out.println(text.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException handled using try-catch block");
		}
	}

	public static void main(String[] args) {

		// Calling method to generate exception
		generateException();  

		// Refactored code to handle exception
		handleException();
	}
}
