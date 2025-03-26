//Write a Program to Check 2 Arrays are Equal or Not.
package unique;

import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the arrays
        System.out.print("Enter the number of elements in the arrays: ");
        int n = scanner.nextInt();

        // Create two arrays of the specified size
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        // Input elements for the first array
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input elements for the second array
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        // Check if both arrays are equal
        if (areArraysEqual(array1, array2)) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if two arrays are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        // If arrays are not the same length, they are not equal
        if (array1.length != array2.length) {
            return false;
        }

        // Compare each element of the arrays
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        // If all elements match, the arrays are equal
        return true;
    }
}