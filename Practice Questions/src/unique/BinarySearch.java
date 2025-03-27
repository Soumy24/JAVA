//Write a Program to Search an Element in Array (Binary Search).
package unique;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create a sorted array
        int[] array = new int[n];

        // Prompt the user to enter the elements of the array (make sure they are sorted)
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Prompt the user to enter the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform binary search and display the result
        int result = binarySearch(array, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform binary search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        // Loop while the left index is less than or equal to the right index
        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the middle index

            // Check if the target element is at the mid position
            if (array[mid] == target) {
                return mid;  // Return the index if found
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        return -1;  // Return -1 if the element is not found
    }
}
