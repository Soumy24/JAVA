// WAP to Check if an Array is Sorted
package unique;

import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        // Declare an array of size n
        int[] array = new int[n];

        // Take array input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array is sorted in ascending order
        boolean isSorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Output the result
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
