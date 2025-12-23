public class IllegalArgumentExceptionDemo {

	// Method to generate IllegalArgumentException
	public static void generateException() {
		Thread t = new Thread();
		t.setPriority(20); // Valid range is 1 to 10
	}

	// Method to handle IllegalArgumentException
	public static void handleException() {
		try {
			generateException();
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException handled using try-catch block");
		}
	}

	public static void main(String[] args) {
		handleException();
	}
}
