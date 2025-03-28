//WAP to Move All Zeros to the End of the Array
package unique;

import java.util.Scanner;

public class MoveZerosToEnd {
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

        // Move all zeros to the end of the array
        int nonZeroIndex = 0;

        // Traverse the array, if the element is non-zero, move it to the front
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex] = array[i];
                if (nonZeroIndex != i) {
                    array[i] = 0; // Place zero in the original position
                }
                nonZeroIndex++;
            }
        }

        // Output the modified array
        System.out.println("Array after moving zeros to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
