package Day_8;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do{
            //code to be executed
            System.out.print("Enter an integer: 0 to quit: ");
            input = scanner.nextInt();
            System.out.println("Thank for entering : "+input);
        }while(input != 0);
        scanner.close();
    }
}
