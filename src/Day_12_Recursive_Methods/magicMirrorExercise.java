package src.Day_12_Recursive_Methods;

import java.util.Scanner;

public class magicMirrorExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reflect in the magic mirror: ");
        String input = scanner.nextLine();
        String reverseString = reverseSting(input);
        System.out.println("The magic mirror reflect: " + reverseString);
        scanner.close();
    }
    public static String reverseSting(String str) {
        //Base case
        if(str.isEmpty() || str.length() == 1){
            return str;
        }
        //recursive case
        return str.charAt(str.length()-1) + reverseSting(str.substring(0, str.length()-1));
    }
}
