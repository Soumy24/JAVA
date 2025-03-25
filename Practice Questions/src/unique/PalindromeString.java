//
package unique;
public class PalindromeString {
    public static void main(String[] args) {
        // Initialize the string
        String str = "DAD";  // You can change this string to test with other values

        // Initialize a variable to store the reversed string
        String reversedStr = "";

        // Loop to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);  // Append each character from end to the reversed string
        }

        // Check if the original string is equal to the reversed string
        if (str.equals(reversedStr)) {
            System.out.println(str + " - is a palindrome.");
        } else {
            System.out.println(str + " - is not a palindrome.");
        }
    }
}