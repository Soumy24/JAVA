//Write a Program to Find the Duplicate Number in Array.
package unique;

import java.util.Scanner;

public class DuplicateNumber {
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

        // Find and display the duplicate number
        findDuplicate(array);

        // Close the scanner
        scanner.close();
    }

    // Method to find duplicate number in the array
    public static void findDuplicate(int[] array) {
        boolean foundDuplicate = false;

        // Loop through the array to check for duplicates
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate number found: " + array[i]);
                    foundDuplicate = true;
                    break;
                }
            }
            if (foundDuplicate) {
                break;
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate numbers found.");
        }
    }
}