//WAP to print all prime numbers up to n.
package unique;

import java.util.Scanner;

public class PrimeNumbersN {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print all prime numbers up to n
        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i <= n; i++) {
            // Check if the number is prime
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner object
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // A number less than 2 is not prime
        if (num < 2) {
            return false;
        }

        // Check divisibility from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // It's a prime number
    }
}
