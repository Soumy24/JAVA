//Write a Program to Find Number is Even or Odd.
package unique;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}