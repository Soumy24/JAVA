//WAP to convert Celsius to Fahrenheit.
package unique;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Print the temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Close the scanner object
        scanner.close();
    }
}
