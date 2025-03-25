//WAP to reverse a string.

package unique;

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Taking input for the string
        System.out.print("Enter a string: ");
        String inputString = s.nextLine();

        // Reversing the string
        String reversedString = "";
        // Loop through the string in reverse order and build the reversed string
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }

        // Displaying the reversed string
        System.out.println("Reversed string: " + reversedString);

        // Close the scanner
        s.close();
    }
}