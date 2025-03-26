//Write a Program to Find Weather the given Number is Prime Number or Not.
package unique;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= num / 2; i++) {  // Check divisibility up to num / 2
            if (num % i == 0) {
                return false;  // If divisible, it's not a prime number
            }
        }
        return true;  // The number is prime
    }
}