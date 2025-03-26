//Write a Program to Remove all the White Space in a String.
package unique;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove all white spaces from the string
        String result = removeWhiteSpace(input);

        // Display the result
        System.out.println("String after removing white spaces: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to remove all white spaces from a string
    public static String removeWhiteSpace(String str) {
        // Using the replaceAll() method to remove all white spaces
        return str.replaceAll("\\s", "");
    }
}