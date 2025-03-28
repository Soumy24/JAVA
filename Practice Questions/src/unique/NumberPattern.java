//WAP to print the pattern series like 1, 12, 123, 1234, ..., up to n.
package unique;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print the pattern series
        for (int i = 1; i <= n; i++) {
            // Loop to print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner object
        scanner.close();
    }
}
