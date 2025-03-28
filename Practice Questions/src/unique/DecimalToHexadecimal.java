//WAP to Convert Decimal to Hexadecimal
package unique;

import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert the decimal number to hexadecimal
        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        // Display the result
        System.out.println("Hexadecimal representation: " + hexadecimal);

        // Close the scanner object
        scanner.close();
    }
}
