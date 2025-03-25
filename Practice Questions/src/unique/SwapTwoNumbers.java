//WAP to program to swap 2 numbers, without initializing values
package unique;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Take input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();

        // Displaying numbers before swap
        System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);

        // Swapping the numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Displaying numbers after swap
        System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);

        // Close the scanner object
        s.close();
    }
}
