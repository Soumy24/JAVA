//WAP  to find the common elements between two arrays (string, integer, etc.) of sorted elements.
package unique;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size and elements of the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        System.out.println("Enter the elements of the first array (sorted):");
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Prompt the user for the size and elements of the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        System.out.println("Enter the elements of the second array (sorted):");
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Find and print the common elements between the two arrays
        List<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements between the two arrays are:");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }

        // Close the scanner object
        scanner.close();
    }

    // Method to find common elements between two sorted arrays
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonList = new ArrayList<>();
        int i = 0, j = 0;

        // Use two pointers to traverse the sorted arrays
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                // If both elements are equal, add to the common list
                commonList.add(array1[i]);
                i++;
                j++;
            }
        }

        return commonList;
    }
}
