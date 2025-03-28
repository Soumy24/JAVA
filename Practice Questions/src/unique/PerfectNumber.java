//WAP to check for Perfect Number.
package unique;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        // Close the scanner object
        scanner.close();
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int num) {
        int sum = 0;

        // Find divisors and sum them up
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // If the sum of divisors is equal to the number, it's a perfect number
        return sum == num;
    }
}
