//WAP to Sum of Natural Numbers or WAP to Sum of n Natural Numbers.
package unique;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number (n)
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Calculate the sum of natural numbers up to n
        int sum = sumOfNaturalNumbers(n);

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // Close the scanner object
        scanner.close();
    }

    // Method to calculate the sum of first n natural numbers
    public static int sumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2; // Formula to calculate the sum
    }
}
