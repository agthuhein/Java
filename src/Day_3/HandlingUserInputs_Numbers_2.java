package Day3;
import java.util.Scanner;

public class HandlingUserInputs_Numbers_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Enter you name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Welcome to the Java Clue: " + name + ". Your age is " + age + ".");

         */
        System.out.print("Enter number A: ");
        int a = sc.nextInt();

        System.out.print("Enter number B: ");
        int b = sc.nextInt();

        System.out.print("The result is: " + (a + b));
        sc.close();
    }
}
