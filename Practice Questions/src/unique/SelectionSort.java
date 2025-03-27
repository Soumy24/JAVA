//Write a Program to Selection Sort Elements in Array.
package unique;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[n];

        // Prompt the user to enter the elements for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform selection sort on the array
        selectionSort(array);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Outer loop to iterate over the entire array
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum element is the first element
            int minIndex = i;

            // Inner loop to find the smallest element in the remaining unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;  // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
