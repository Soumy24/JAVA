//WAP to reverse an array in-place. or WAP to reverse an array
package unique;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Reverse the array in-place
        reverseArray(array);

        // Display the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner object
        scanner.close();
    }

    // Method to reverse the array in-place
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        // Swap elements from start and end until they meet in the middle
        while (start < end) {
            // Swap the elements
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move the indices towards the center
            start++;
            end--;
        }
    }
}
