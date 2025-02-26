package src.Day_13_Exercises;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int digits = numberOfDigits(n);
        System.out.println(digits);
        scanner.close();
    }
    public static int numberOfDigits(int n) {
        if(n < 10){
            return 1;
        }
        else{
            return 1 + numberOfDigits(n/10);
        }
    }
}
