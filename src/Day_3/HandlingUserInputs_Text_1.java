package Day3;
import java.util.Scanner;   //step 1

public class HandlingUserInputs_Text_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //Step 2

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();   //Step 3
        System.out.println("Welcome to the Java Club " + name);
        scanner.close();    //Step 4

    }
}
