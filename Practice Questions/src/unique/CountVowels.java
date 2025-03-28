//WAP to Count Vowels in a String.
package unique;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Initialize a counter for vowels
        int vowelCount = 0;

        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        input = input.toLowerCase();

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Output the result
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
