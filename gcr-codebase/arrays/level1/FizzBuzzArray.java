import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number > 0) {

            // Create String array to store results
            String[] results = new String[number + 1];

            // Loop from 0 to number and store values
            for (int i = 0; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } 
                else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } 
                else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } 
                else {
                    results[i] = String.valueOf(i);
                }
            }

            // Loop again to print results with index position
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}
