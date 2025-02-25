package Day_11;

import java.util.Scanner;

public class sandWichMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter slice of cheese you wish to make sandwich: ");
        makeSandWich(scanner.nextInt());
        scanner.close();
    }
    public static void makeSandWich(int piecesOfChees) {
        System.out.println("Take two slices of bread");
        System.out.println("Spread butter on one slide");
        for(int i = 1; i <= piecesOfChees; i++){
            System.out.println("Add a slice of cheese");
        }
        System.out.println("Put the second slice of bread on top.");
        System.out.println("Sandwich is ready!");
    }
}
