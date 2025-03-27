//Write a Program to Search an Element in Array (Linear Search).
package unique;
import java.util.Scanner;
public class LinearSearch {
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

        // Prompt the user to enter the element to search for
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform the linear search and display the result
        int result = linearSearch(array, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to perform linear search
    public static int linearSearch(int[] array, int target) {
        // Loop through the array to search for the target element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Return the index if element is found
            }
        }
        return -1;  // Return -1 if element is not found
    }
}
