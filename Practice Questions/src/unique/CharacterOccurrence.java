//Write a Program to Count the Occurrence of a Character
package unique;

import java.util.Scanner;

public class CharacterOccurrence {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Prompt the user to enter the character to count
        System.out.print("Enter the character to count: ");
        char ch = scanner.next().charAt(0);

        // Count the occurrence of the character
        int count = countCharacterOccurrence(input, ch);

        // Display the result
        System.out.println("The character '" + ch + "' appears " + count + " times in the string.");

        // Close the scanner
        scanner.close();
    }

    // Method to count the occurrence of a character in a string
    public static int countCharacterOccurrence(String str, char ch) {
        int count = 0;

        // Loop through the string and count occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}
