//WAP to print Fibonacci series up to n.
package unique;

import java.util.Scanner;

public class FibonacciSeriesN {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print the Fibonacci series up to n
        System.out.println("Fibonacci series up to " + n + ":");

        // Initialize the first two Fibonacci numbers
        int first = 0, second = 1;

        // Print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        // Close the scanner object
        scanner.close();
    }
}
