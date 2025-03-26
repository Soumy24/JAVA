//Write a Program to Count Number of digits in a Number.
package unique;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to count the number of digits
        int count = 0;

        // Check for 0, which has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop to count digits by dividing the number by 10 until it becomes 0
            while (number != 0) {
                number /= 10;
                count++;
            }
        }

        // Display the count of digits
        System.out.println("Number of digits: " + count);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}