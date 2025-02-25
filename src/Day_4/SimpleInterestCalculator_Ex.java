package Day4;

import java.util.Scanner;

public class SimpleInterestCalculator_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter annual interest rate (in percents): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        double time = sc.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest $" + interest);
        sc.close();
    }
}
