//Write a Program to Generate Random Number and String.
package unique;

import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        // Create a random object
        Random random = new Random();

        // Generate a random number between 0 and 100
        int randomNumber = random.nextInt(101);  // 101 is exclusive, so it generates a number between 0 and 100

        // Generate a random string of 8 characters
        String randomString = generateRandomString(8);

        // Display the random number and string
        System.out.println("Random Number: " + randomNumber);
        System.out.println("Random String: " + randomString);
    }

    // Method to generate a random string of a given length
    public static String generateRandomString(int length) {
        // Characters to choose from
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomStr = new StringBuilder();

        // Randomly pick characters and build the string
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomStr.append(characters.charAt(index));
        }

        return randomStr.toString();
    }
}