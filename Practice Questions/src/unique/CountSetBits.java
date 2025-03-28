//WAP to Count Set Bits in a Number.
package unique;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Count the number of set bits (1s) in the binary representation
        int count = 0;
        while (number > 0) {
            // Increment count if the least significant bit is 1
            count += number & 1;
            // Right shift the number by 1
            number >>= 1;
        }

        // Display the count of set bits
        System.out.println("Number of set bits: " + count);

        // Close the scanner object
        scanner.close();
    }
}
