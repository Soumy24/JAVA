//WAP to convert Fahrenheit to Celsius.
package unique;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Print the temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);

        // Close the scanner object
        scanner.close();
    }
}
