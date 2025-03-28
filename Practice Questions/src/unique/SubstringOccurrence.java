//WAP to find the Occurrence of a Substring in a String
package unique;
import java.util.Scanner;

public class SubstringOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        // Take the substring to search for
        System.out.println("Enter the substring:");
        String substring = scanner.nextLine();

        // Call the function to find the occurrence
        int count = countSubstringOccurrences(mainString, substring);

        // Output the result
        System.out.println("The substring occurs " + count + " time(s) in the main string.");
    }

    // Function to count the occurrences of the substring in the main string
    public static int countSubstringOccurrences(String mainString, String substring) {
        // If the substring is empty, return 0
        if (substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();  // Move the index forward after a match
        }

        return count;
    }
}
