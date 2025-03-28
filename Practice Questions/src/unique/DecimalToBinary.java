//WAP to Decimal to Binary Conversion or WAP to convert a binary number to decimal number.
package unique;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert the decimal number to binary
        String binary = Integer.toBinaryString(decimal);

        // Display the binary result
        System.out.println("Binary representation: " + binary);

        // Close the scanner object
        scanner.close();
    }
}
