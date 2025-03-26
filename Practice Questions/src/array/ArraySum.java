//Write a Program to find the Sum of Elements in Array.
package array;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[n];

        // Prompt the user to enter elements for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Display the sum
        System.out.println("The sum of the elements in the array is: " + sum);

        // Close the scanner
        scanner.close();
    }
}
