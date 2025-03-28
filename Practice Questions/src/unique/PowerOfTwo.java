//WAP to Check if a Number is Power of 2.
package unique;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a power of 2
        if (number > 0 && (number & (number - 1)) == 0) {
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }

        // Close the scanner object
        scanner.close();
    }
}
