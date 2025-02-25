package Day1;

import java.util.Scanner;

public class Day1_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        System.out.println(message);

        System.out.println("Text with escape sequence: ");
        System.out.println("Hello, \"Java Master Calss\" students!");
        System.out.println("Welcome to day 1.");
        System.out.println("Let\'s get started.");
    }
}
