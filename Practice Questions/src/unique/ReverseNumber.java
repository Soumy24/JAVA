//WAP to reverse a number

package unique;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        // Variable to store the reversed number
        int reversedNum = 0;

        // Reversing the number
        while (num != 0) {
            int digit = num % 10;          // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10;                     // Remove the last digit
        }

        // Displaying the reversed number
        System.out.println("Reversed number: " + reversedNum);

        // Close the scanner
        s.close();
    }
}