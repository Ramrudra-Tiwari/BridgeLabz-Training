import java.util.Scanner;

public class CheckAnPalindrome {

    // Creating a function to checkAnPalindrome
    public static boolean checkPalindrome(String str) {
        String reversedString = reverse(str);
        return str.equals(reversedString);
    }


    // Creating a function to reverse an string
    public static String reverse(String str) {
        int len = str.length();
        String reversedString = "";

        for (int i = len - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        // Taking  input from user
        System.out.print("Enter a String : ");
        String input = Sc.nextLine();

        // Calling the function and storing the result
        boolean result = checkPalindrome(input);

        System.out.println(result);

        Sc.close();
    }
}
