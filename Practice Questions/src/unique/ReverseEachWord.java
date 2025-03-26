//Write a Program to Reverse Each Word in a String.

package unique;
import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse each word in the string
        String result = reverseWords(input);

        // Display the result
        System.out.println("String with each word reversed: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse each word in the string
    public static String reverseWords(String str) {
        // Split the string into words using space as a delimiter
        String[] words = str.split("\\s+");

        // StringBuilder to hold the result
        StringBuilder reversedString = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            // Reverse the current word and append it to the result
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse().toString()).append(" ");
        }

        // Trim any extra space at the end and return the result
        return reversedString.toString().trim();
    }
}
