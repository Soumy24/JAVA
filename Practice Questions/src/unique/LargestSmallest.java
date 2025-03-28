//WAP to find the Largest and Smallest Element in an Array
package unique;

import java.util.Scanner;

public class LargestSmallest {
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

        // Initialize the largest and smallest elements
        int largest = array[0];
        int smallest = array[0];

        // Traverse the array to find the largest and smallest elements
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the largest and smallest elements
        System.out.println("Largest element in the array is: " + largest);
        System.out.println("Smallest element in the array is: " + smallest);
    }
}
