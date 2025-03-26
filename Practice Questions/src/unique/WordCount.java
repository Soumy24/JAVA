//Write a Program to Count Words in a String.
package unique;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the number of words in the string
        int wordCount = countWords(input);

        // Display the result
        System.out.println("The number of words in the string is: " + wordCount);

        // Close the scanner
        scanner.close();
    }

    // Method to count the number of words in a string
    public static int countWords(String str) {
        // Trim any leading/trailing spaces and split the string by one or more spaces
        String[] words = str.trim().split("\\s+");

        // Return the length of the resulting array, which represents the number of words
        return words.length;
    }
}
