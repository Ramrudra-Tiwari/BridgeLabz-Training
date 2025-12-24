import java.util.Scanner;

public class ToggleCaseOfCharacters {

    // Method to toggle case of characters
    public static String toggleCase(String text) {
        String result = "";

        // Traverse each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            }
            // Convert lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            }
            // Keep other characters unchanged
            else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.println("Toggled string: " + toggleCase(input));

        sc.close();
    }
}
