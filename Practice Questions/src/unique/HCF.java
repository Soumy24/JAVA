//WAP to find the HCF of Two Numbers.
package unique;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the HCF of the two numbers
        int hcf = findHCF(num1, num2);

        // Display the result
        System.out.println("The HCF (GCD) of " + num1 + " and " + num2 + " is: " + hcf);

        // Close the scanner object
        scanner.close();
    }

    // Method to find the HCF (GCD) using Euclidean algorithm
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
