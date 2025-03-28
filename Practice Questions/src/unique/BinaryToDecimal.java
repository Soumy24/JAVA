//WAP to Binary to Decimal Conversion or WAP to convert a decimal number to binary number.
package unique;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take binary input as a string
        System.out.println("Enter a binary number:");
        String binary = scanner.nextLine();

        // Convert binary to decimal
        int decimal = binaryToDecimal(binary);

        // Output the result
        System.out.println("The decimal value of binary " + binary + " is: " + decimal);
    }

    // Function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Traverse the binary string in reverse order
        for (int i = binary.length() - 1; i >= 0; i--) {
            // If the character is '1', add the power of 2 to the decimal value
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        return decimal;
    }
}
