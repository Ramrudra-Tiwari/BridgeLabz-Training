import java.util.Scanner;

public class LongestWord {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {

        // Split the sentence into words using space
        String[] words = sentence.split(" ");

        String longest = "";

        // Traverse each word
        for (String word : words) {
            // Check if current word is longer than previous longest
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        // Scanner to take user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Calling method and displaying result
        System.out.println("Longest word: " + findLongestWord(sentence));

        sc.close();
    }
}
