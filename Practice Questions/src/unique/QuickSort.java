//Write a Program to Quick  Sort Elements in Array.
package unique;

import java.util.Scanner;

public class QuickSort {

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

        // Perform quick sort on the array
        quickSort(array, 0, n - 1);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform quick sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Find pivot element such that array[pivot] is in the correct position
            int pi = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Method to partition the array and return the pivot index
    public static int partition(int[] array, int low, int high) {
        // Pivot is the last element
        int pivot = array[high];

        // Index of smaller element
        int i = (low - 1);

        // Traverse through the array and rearrange elements based on pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap elements at i and j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the element at i + 1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition index
        return i + 1;
    }
}
