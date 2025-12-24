import java.util.Scanner ;
public class CountAnVowelsConsonants {
    
    public static void countVowelsAndConsonants(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null");
            return;
        }
        
        int vowels = 0;
        int consonants = 0;
        
        // Convert to lowercase to do comparison easily
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if it's a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            // Non-alphabetic characters are ignored
        }
        
        System.out.println("String: " + str);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
    
    public static void main(String[] args) {
        // Test cases
        Scanner Sc = new Scanner(System.in);
        
        String input = Sc.nextLine();
        countVowelsAndConsonants(input);
        
        Sc.close();
    }
}