//Write a Program to Count Number of Even and Odd Digits in a Number.
package unique;

import java.util.Scanner;

public class EvenOddDigits {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variables to count even and odd digits
        int evenCount = 0;
        int oddCount = 0;

        // Loop to count even and odd digits
        while (number != 0) {
            int digit = number % 10; // Extract the last digit

            if (digit % 2 == 0) {
                evenCount++; // If the digit is even
            } else {
                oddCount++; // If the digit is odd
            }

            number /= 10; // Remove the last digit
        }

        // Display the counts
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of odd digits: " + oddCount);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}