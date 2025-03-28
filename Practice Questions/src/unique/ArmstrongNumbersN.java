//WAP  to print the Armstrong numbers between 1 and n.
package unique;

import java.util.Scanner;

public class ArmstrongNumbersN {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Print Armstrong numbers between 1 and n
        System.out.println("Armstrong numbers between 1 and " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner object
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Get the number of digits in the number

        // Calculate the sum of the digits raised to the power of the number of digits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // If the sum is equal to the original number, it's an Armstrong number
        return sum == originalNum;
    }
}
