package src.Day_14_BinarySearch;

import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think number between 1 and 100: ");
        System.out.println("I will try to guess it based on your feedback.");

        int low = 1;
        int high = 100;

        boolean correct = false;
        while(!correct) {
            int guess = low + (high - low) / 2;
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'h' if your number is higher, 'l' if it is lower, or 'c' if it is correct: ");
            char feedback = scanner.next().charAt(0);
            if(feedback == 'h') {
                low = guess + 1;
            }
            else if(feedback == 'l') {
                high = guess + 1;
            }
            else if(feedback == 'c') {
                correct = true;
                System.out.println("I guess your number and it is " + guess + ".");
            }
            else {
                System.out.println("Invalid input. Please enter 'h', 'l' or 'c'");
            }
        }
        scanner.close();
    }
}
