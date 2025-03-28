//WAP to convert a given string into lowercase.
package unique;

import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert the string to lowercase
        String lowerCaseString = inputString.toLowerCase();

        // Display the result
        System.out.println("The string in lowercase is: " + lowerCaseString);

        // Close the scanner object
        scanner.close();
    }
}
