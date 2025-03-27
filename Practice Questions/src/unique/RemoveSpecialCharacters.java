//Write a Program to Remove Junk or Special character in a String.
package unique;
import java.util.Scanner;
public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove junk or special characters from the string
        String result = removeSpecialCharacters(input);

        // Display the result
        System.out.println("String after removing special characters: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to remove special characters from the string
    public static String removeSpecialCharacters(String str) {
        // Replace any character that is not a letter or digit with an empty string
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
