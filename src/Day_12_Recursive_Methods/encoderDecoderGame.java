package src.Day_12_Recursive_Methods;

import java.util.Scanner;

public class encoderDecoderGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Welcome to the Encoder-Decoder Game!");
        System.out.println("1. Encode a string");
        System.out.println("2. Decode a string");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        if (choice == 1) {
            // Call encode function and display result
            String encodedString = encode(input, 0);
            System.out.println("Encoded string: " + encodedString);
        } else if (choice == 2) {
            // Call decode function and display result
            String decodedString = decode(input, 0);
            System.out.println("Decoded string: " + decodedString);
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    // Recursive function to encode the string using Atbash cipher
    public static String encode(String input, int index) {
        // Base case: If the end of the string is reached, return an empty string
        if (index == input.length()) {
            return "";
        }
        // Get the current character and encode it using the Atbash cipher
        char ch = input.charAt(index);
        char encodedChar = atbash(ch);
        // Recursive call for the next character
        return encodedChar + encode(input, index + 1);
    }

    // Recursive function to decode the string using Atbash cipher (same as encoding)
    public static String decode(String input, int index) {
        // Base case: If the end of the string is reached, return an empty string
        if (index == input.length()) {
            return "";
        }
        // Get the current character and decode it using the Atbash cipher
        char ch = input.charAt(index);
        char decodedChar = atbash(ch);
        // Recursive call for the next character
        return decodedChar + decode(input, index + 1);
    }

    // Function to apply the Atbash cipher to a character
    public static char atbash(char ch) {
        // Encode/decode lowercase letters
        if (ch >= 'a' && ch <= 'z') {
            return (char) ('z' - (ch - 'a'));
            // Encode/decode uppercase letters
        } else if (ch >= 'A' && ch <= 'Z') {
            return (char) ('Z' - (ch - 'A'));
        } else {
            // Non-alphabet characters are not encoded
            return ch;
        }
    }
}
