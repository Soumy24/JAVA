//WAP to print the sum of the series 1 + 1/2 + 1/3 + ... + 1/n.
package unique;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculate the sum of the series
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Add the reciprocal of i to the sum
        }

        // Print the result
        System.out.println("The sum of the series is: " + sum);

        // Close the scanner object
        scanner.close();
    }
}
