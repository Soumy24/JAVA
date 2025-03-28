//WAP to Check if a String is an Isogram.
package unique;

import java.util.Scanner;

import java.util.HashSet;

public class IsogramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Check if the string is an isogram
        if (isIsogram(input)) {
            System.out.println("The string is an isogram.");
        } else {
            System.out.println("The string is not an isogram.");
        }
    }

    // Function to check if a string is an isogram
    public static boolean isIsogram(String str) {
        // Create a HashSet to store the characters
        HashSet<Character> seenChars = new HashSet<>();

        // Convert the string to lowercase to make the check case-insensitive
        str = str.toLowerCase();

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // If the character is already in the set, it's not an isogram
            if (seenChars.contains(currentChar)) {
                return false;
            }

            // Add the character to the set
            seenChars.add(currentChar);
        }

        // If no duplicate characters were found, it's an isogram
        return true;
    }
}
