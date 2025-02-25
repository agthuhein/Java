package Day_8;

import java.util.Scanner;

public class forLoop_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int fristTerm = 0, secondTerm = 1;
        if(number == 1){
            System.out.println(fristTerm);
        }
        else{
            System.out.print(fristTerm + " " + secondTerm);

            for (int i = 3; i <= number; i++) {
                int nextTerm = fristTerm + secondTerm;
                System.out.print(" " + nextTerm);
                fristTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }

        scanner.close();
    }
}
