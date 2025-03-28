//WAP to find the Majority Element in the array.
package unique;

import java.util.Scanner;

public class MajorityElement {
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

        // Boyer-Moore Voting Algorithm
        int majorityElement = findMajorityElement(array);

        // Check if majority element exists
        if (majorityElement != -1 && isMajority(array, majorityElement)) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("There is no majority element.");
        }
    }

    // Function to find the majority element using Boyer-Moore Voting Algorithm
    public static int findMajorityElement(int[] array) {
        int count = 0, candidate = -1;

        // Step 1: Find the candidate
        for (int num : array) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    // Function to check if the candidate is the majority element
    public static boolean isMajority(int[] array, int candidate) {
        int count = 0;
        for (int num : array) {
            if (num == candidate) {
                count++;
            }
        }
        return count > array.length / 2;
    }
}
