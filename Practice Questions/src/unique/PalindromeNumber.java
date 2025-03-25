//Find whether Number is palindrome or not
package unique;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner s = new Scanner(System.in);

        // Input the number to be checked
        System.out.print("Enter a number: ");
        int a = s.nextInt();

        // Store the original number to compare later
        int org_num = a;
        int d;  // Variable to store each digit
        int rev = 0;  // Variable to store the reversed number

        // Reverse the number
        while (a > 0) {
            d = a % 10;            // Get the last digit
            rev = rev * 10 + d;    // Add it to the reversed number
            a = a / 10;            // Remove the last digit
        }

        // Check if the original number and reversed number are the same
        if (rev == org_num) {
            System.out.println("This is a Palindrome Number.");
        } else {
            System.out.println("This is not a Palindrome Number.");
        }

        // Close the scanner
        s.close();
    }
}