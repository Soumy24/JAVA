//WAP to find the LCM of Two Numbers.
package unique;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the LCM of the two numbers
        int lcm = findLCM(num1, num2);

        // Display the result
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

        // Close the scanner object
        scanner.close();
    }

    // Method to find the LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    // Method to find the GCD (Greatest Common Divisor) using Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
