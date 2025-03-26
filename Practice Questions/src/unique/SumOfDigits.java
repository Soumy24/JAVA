//Write a Program to Find Sum of Digits in a Number.
package unique;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the sum of digits
        int sum = 0;

        // Loop to extract and sum each digit
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit
        }

        // Display the sum of digits
        System.out.println("Sum of digits: " + sum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}