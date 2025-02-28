package src.Day_23_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            int number = scanner.nextInt();
            int result = 10/number;
            System.out.println("The result is: " + result);
        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception"+ e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Input mismatch exception"+ e.getMessage());
        }catch (Exception e){
            System.out.println("Default Exception"+ e.getMessage());
        }
        finally {
            System.out.println("Finally block. It is fine.And run anyway.");
            scanner.close();
        }

    }
}
