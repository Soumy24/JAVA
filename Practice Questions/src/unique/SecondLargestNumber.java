//Write a Program to Find Second Largest Number in Array.
package unique;

import java.util.Scanner;

public class SecondLargestNumber {
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

        // Find and display the second largest number
        int secondLargest = findSecondLargest(array);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to find the second largest number
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;            // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;      // Update second largest
            }
        }

        return secondLargest;
    }
}