//WAP to find the XOR of Two Numbers.
package unique;

import java.util.Scanner;

public class XORofTwoNumbers {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find the XOR of the two numbers
        int result = num1 ^ num2;

        // Display the result
        System.out.println("The XOR of the two numbers is: " + result);

        // Close the scanner object
        scanner.close();
    }
}
