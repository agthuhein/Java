package Day3;
import java.util.Scanner;

public class CalorieCounterPro_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calorie Counter Pro!");
        System.out.println("Enter the name of the first food item: ");
        String firstFoodName = sc.nextLine();

        System.out.println("Enter the calories for " + firstFoodName + ":");
        int calories = sc.nextInt();
        sc.nextLine(); //to consume the next line (Enter Key)

        System.out.println("Enter the name of the second food item: ");
        String secondFoodName = sc.nextLine();

        System.out.println("Enter the calories for " + secondFoodName + ":");
        int calories2 = sc.nextInt();
        sc.nextLine(); //to consume the next line (Enter Key)

        System.out.println("Enter the name of the third food item: ");
        String thirdFoodName = sc.nextLine();

        System.out.println("Enter the calories for " + thirdFoodName + ":");
        int calories3 = sc.nextInt();
        sc.nextLine(); //to consume the next line (Enter Key)

        System.out.println("\nYour Calorie Intake:");
        System.out.println("1. " + firstFoodName + "-" + calories + " calories");
        System.out.println("2. " + secondFoodName + "-" + calories2 + " calories");
        System.out.println("3. " + thirdFoodName + "-" + calories3 + " calories");

        System.out.println("\nTotal Calorie Intake: " + (calories+calories2+calories3) + " calories");
        System.out.println("Thank you for using Calorie Counter Pro!");

    }
}
