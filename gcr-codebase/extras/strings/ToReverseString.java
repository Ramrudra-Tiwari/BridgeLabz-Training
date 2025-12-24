import java.util.Scanner;

public class ToReverseString {

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

        Systen.out.print("Enter a String : ")
        String input = Sc.nextLine();
        String result = reverse(input);

        System.out.println(result);

        Sc.close();
    }
}
