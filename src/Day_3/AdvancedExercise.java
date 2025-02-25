package Day3;
import java.util.Scanner;

public class AdvancedExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price of the item : ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the selling price of the item : ");
        int sellPrice = sc.nextInt();
        sc.nextLine();

        float profit = sellPrice - price;
        System.out.println("The profit is : " + profit);

        System.out.println("\nDemonstrating Unary Operators: ");
        int initial = 10;
        System.out.println("Initial units sold : " + initial);
        initial++;
        System.out.println("Units sold after increment : " + initial);
        initial--;
        System.out.println("Units sold after decrement : " + initial);

        System.out.println("\nDemonstrating Compound Operators: ");
        System.out.println("Total revenue after selling 10 units: $" + (sellPrice * 10));

        System.out.println("\nDemonstrating Modulo Operators: ");
        System.out.println("Remainder when units sold is divided by 3: " + (int)(initial % 3));

        sc.close();
    }
}
