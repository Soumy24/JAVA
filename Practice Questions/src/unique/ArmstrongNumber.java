//Write a Program to Check Number is Armstrong Number.
package unique;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number for comparison
        int originalNumber = number;
        int sum = 0;

        // Find the sum of cubes of its digits
        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit * digit * digit; // Add the cube of the digit to sum
            number /= 10; // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}