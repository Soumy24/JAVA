package unique;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number using if-else
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("The smallest number is: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("The smallest number is: " + num2);
        } else {
            System.out.println("The smallest number is: " + num3);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
