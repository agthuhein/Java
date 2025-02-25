package src.Day_12_Recursive_Methods;

import java.util.Scanner;

public class recursiveMethod_1 {
    public static void main(String[] args) {
        //4! = 4*3*2*1 = 24
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of: " + number + " is " + result);
    }
    public static int factorial(int n) {
        if(n==0){
            return 1;   //base case: return 1 if n == 0
        }
        return n*factorial(n-1);    //recursive case:
    }
}
