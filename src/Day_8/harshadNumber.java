package Day_8;

import java.util.Scanner;

public class harshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;

        int sumOfDigits = 0;

        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        if (originalNumber % sumOfDigits == 0) {
            System.out.println("The number is a harshad number");
        }
        else {
            System.out.println("The number is not a harshad number");
        }
    }
}
