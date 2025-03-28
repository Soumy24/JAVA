//WAP to find the Longest Substring Without Repeating Characters.
package unique;

import java.util.Scanner;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Call the function to find the longest substring
        String result = longestUniqueSubstring(input);

        // Output the result
        System.out.println("The longest substring without repeating characters is: " + result);
    }

    // Function to find the longest substring without repeating characters
    public static String longestUniqueSubstring(String str) {
        HashSet<Character> seenChars = new HashSet<>();
        int start = 0;
        int maxLength = 0;
        int maxStart = 0;

        // Iterate through the string with two pointers
        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            // If the character is already in the set, move the start pointer
            while (seenChars.contains(currentChar)) {
                seenChars.remove(str.charAt(start));
                start++;
            }

            // Add the current character to the set
            seenChars.add(currentChar);

            // Update the maximum length and starting position
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        // Return the longest substring
        return str.substring(maxStart, maxStart + maxLength);
    }
}
