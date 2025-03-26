//Write a Program to Find the Max and Min Element in Array.
package unique;

import java.util.Scanner;

public class MaxMinInArray {
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

        // Find and display the max and min elements
        int max = findMax(array);
        int min = findMin(array);

        System.out.println("The maximum element in the array is: " + max);
        System.out.println("The minimum element in the array is: " + min);

        // Close the scanner
        scanner.close();
    }

    // Method to find the maximum element in the array
    public static int findMax(int[] array) {
        int max = array[0];  // Assume the first element is the max

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];  // Update max if a larger element is found
            }
        }

        return max;
    }

    // Method to find the minimum element in the array
    public static int findMin(int[] array) {
        int min = array[0];  // Assume the first element is the min

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];  // Update min if a smaller element is found
            }
        }

        return min;
    }
}
