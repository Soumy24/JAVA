//WAP to Add Two Binary Numbers
package unique;

import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two binary numbers
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        // Convert the binary strings to integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the two numbers
        int sum = num1 + num2;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        // Display the result
        System.out.println("Sum of the two binary numbers: " + binarySum);

        // Close the scanner object
        scanner.close();
    }
}
