//WAP to count the total number of vowels and consonants in a string.
package unique;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Initialize counters for vowels and consonants
        int vowelsCount = 0;
        int consonantsCount = 0;

        // Convert the string to lowercase to simplify the check
        inputString = inputString.toLowerCase();

        // Loop through each character of the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        // Display the results
        System.out.println("Total number of vowels: " + vowelsCount);
        System.out.println("Total number of consonants: " + consonantsCount);

        // Close the scanner object
        scanner.close();
    }
}
