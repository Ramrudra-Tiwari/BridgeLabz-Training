import java.util.Scanner;

public class RemoveDuplicatesFromString {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String input) {

        // Boolean array to keep track of visited characters (ASCII range)
        boolean[] visited = new boolean[256];

        // StringBuilder is used for efficient string concatenation
        StringBuilder result = new StringBuilder();

        // Traverse each character of the input string
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            // If the character has not been seen before
            if (!visited[currentChar]) {

                // Mark character as visited
                visited[currentChar] = true;

                // Append character to result
                result.append(currentChar);
            }
        }

        // Convert StringBuilder to String and return it
        return result.toString();
    }

    public static void main(String[] args) {

        // Creating Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calling method to remove duplicate characters
        String output = removeDuplicates(input);

        // Displaying result
        System.out.println("String after removing duplicates: " + output);

        // Closing scanner
        sc.close();
    }
}
