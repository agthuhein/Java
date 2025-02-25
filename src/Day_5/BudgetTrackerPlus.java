package Day5;

import java.util.Scanner;

public class BudgetTrackerPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your monthly income: $");
        double monthlyIncome = sc.nextDouble();

        System.out.print("Please enter your rent amount: $");
        double rentAmount = sc.nextDouble();

        System.out.print("Please enter your grocery: $");
        double groceryAmount = sc.nextDouble();

        System.out.print("Please enter your transportation: $");
        double transportationAmount = sc.nextDouble();

        System.out.print("Please enter your entertainment: $");
        double entertainmentAmount = sc.nextDouble();

        double totalExpenses = rentAmount + groceryAmount + transportationAmount + entertainmentAmount;
        double remainingIncome = monthlyIncome - totalExpenses;

        double rentPercentage = (rentAmount / monthlyIncome)  * 100;
        double groceryPercentage = (groceryAmount / monthlyIncome)  * 100;
        double transportationPercentage = (transportationAmount / monthlyIncome)  * 100;
        double entertainmentPercentage = (entertainmentAmount / monthlyIncome)  * 100;

        System.out.println("\n***** Budget Summary *****");
        System.out.printf("Monthly income: $%.2f\n", monthlyIncome);
        System.out.printf("Total expenses: $%.2f\n", totalExpenses);
        System.out.printf("Remaining Budget : $%.2f\n", remainingIncome);
        System.out.println("Expenses Breakdown: ");
        System.out.printf("Rent: $%.2f (%.2f%% of income)\n",rentAmount, rentPercentage);
        System.out.printf("Grocery: $%.2f (%.2f%% of income)\n", groceryAmount, groceryPercentage);
        System.out.printf("Transportation: $%.2f (%.2f%% of income)\n", transportationAmount, transportationPercentage);
        System.out.printf("Entertainment: $%.2f (%.2f%% of income)\n", entertainmentAmount, entertainmentPercentage);
    }
}
