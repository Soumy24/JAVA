//Write a Program to Print Even and Odd Numbers in Array.
package unique;

import java.util.Scanner;

public class EvenOddInArray {
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

        // Print even numbers
        System.out.print("Even numbers in the array: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        // Print odd numbers
        System.out.print("\nOdd numbers in the array: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}