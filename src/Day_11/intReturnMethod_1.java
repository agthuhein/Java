package src.Day_11;

import java.util.Scanner;

public class intReturnMethod_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer: ");
        int number1 = sc.nextInt();
        System.out.println("Please enter a positive integer: ");
        int number2 = sc.nextInt();
        System.out.println("The adding two numbers result is: " + add(number1, number2));
        System.out.println("The subtraction result is: " + subtract(number1, number2));

        sc.close();
    }
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
