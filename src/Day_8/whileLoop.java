package Day_8;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = -1;


        while (userInput != 0) {
            System.out.print("Enter number: ");
            userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        }
        scanner.close();
    }
}
