//Write a Program to Find Prime Numbers in Given Range.
package unique;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        // Initialize the range
        int start = 10;  // Starting value of the range
        int end = 50;    // Ending value of the range

        System.out.println("Prime numbers in the range from " + start + " to " + end + ":");

        // Loop through the range to find prime numbers
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Simple method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= num / 2; i++) {  // Check divisibility up to num / 2
            if (num % i == 0) {
                return false;  // If divisible, it's not prime
            }
        }
        return true;  // The number is prime
    }
}