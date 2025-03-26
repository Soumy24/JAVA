//Write a Program for Fibonacci Series.
package unique;

import java.util.Scanner;

public class FibonacciSeriesCheck {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = scanner.nextInt();

        // Call the method to print Fibonacci series
        printFibonacci(n);

        // Close the scanner
        scanner.close();
    }

    // Method to print Fibonacci series
    public static void printFibonacci(int n) {
        // Initialize the first two Fibonacci numbers
        int first = 0, second = 1;

        // Loop through to generate the Fibonacci series
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // Calculate the next Fibonacci number
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
