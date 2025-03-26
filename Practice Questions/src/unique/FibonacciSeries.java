//WAP for fibonacci series with initialization
package unique;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Initialize the number of terms in the Fibonacci series
        int terms = 10; // You can change this to generate a different number of terms

        // Initialize the first two Fibonacci numbers
        int first = 0, second = 1;

        // Print the Fibonacci series
        System.out.print("Fibonacci Series: ");

        // If the number of terms is less than or equal to 0, print a message
        if (terms <= 0) {
            System.out.println("Please enter a positive integer for the number of terms.");
        } else if (terms == 1) {
            System.out.println(first);
        } else {
            // Print the first two Fibonacci numbers
            System.out.print(first + ", " + second);

            // Calculate and print the remaining Fibonacci numbers
            for (int i = 3; i <= terms; i++) {
                int next = first + second;
                System.out.print(", " + next);

                // Update first and second to the next pair of Fibonacci numbers
                first = second;
                second = next;
            }
        }
    }
}