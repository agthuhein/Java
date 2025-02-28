package src.Day_20_BankAccountManagementSystem_Exercise;

import java.util.Scanner;

public class InputUtils {
    private Scanner scanner;

    public InputUtils() {
        this.scanner = new Scanner(System.in);
    }
    public String readString() {
        return scanner.nextLine();
    }
    public int readInt() {
        while(!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    public double readDouble() {
        while(!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}
