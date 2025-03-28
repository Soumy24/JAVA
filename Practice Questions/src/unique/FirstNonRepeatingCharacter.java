//WAP to Find the First Non-Repeating Character in a String.
package unique;

import java.util.Scanner;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Function to find and print the first non-repeating character
        char result = firstNonRepeatingCharacter(input);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
    }

    // Function to find the first non-repeating character in the string
    public static char firstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Find the first character that appears only once
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCount.get(ch) == 1) {
                return ch; // Return the first non-repeating character
            }
        }

        // If no non-repeating character is found, return '\0'
        return '\0';
    }
}
