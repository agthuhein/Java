package Day2;

public class AdvancedExercise {
    public static void main(String[] args) {
        //Declare and initialize variables of different type
        int wholeNumber = 10;
        double floatingPointNumber = 5.75;
        char singleCharacter = 'A';
        boolean isTrue = true;
        String text = "Java Programming";

        //Display the initialized variables
        System.out.println("Initial Variables:");
        System.out.println("Integer " + wholeNumber);
        System.out.println("Floating Point " + floatingPointNumber);
        System.out.println("Single Character " + singleCharacter);
        System.out.println("isTrue " + isTrue);
        System.out.println("Text " + text);

        System.out.println("Performing Arithmetic Operations:");
        int sum = wholeNumber + 20;
        System.out.println("Sum of whole number: + 20 " + sum);

        double division = floatingPointNumber / 2.0;
        System.out.println("Division of floating point number: " + division);

        System.out.println("Typecasting Demonstration:");
        int typecast = (int) floatingPointNumber;
        System.out.println("Casted floatingPointNumber to int: " + typecast);

        System.out.println("String Manipulation: ");
        String combinedString = text + " is fun!";
        System.out.println(combinedString);

        System.out.println("Boolean Logic: ");
        isTrue = false;
        System.out.println("Negation of isTrue:" + isTrue);
    }
}
