package Day4;

import java.util.Scanner;

public class AdvancedExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a full sentence : ");
        String sentence = sc.nextLine();

        System.out.println("The length of the sentence is : " + sentence.length());
        System.out.println("The first letter of the sentence is : " + sentence.charAt(0));
        System.out.println("The last letter of the sentence is : " + sentence.charAt(sentence.length()-1));

        System.out.println("Enter another sentence to compare : ");
        String compare = sc.nextLine();

        System.out.println("The two sentences are same ignoring case: " + compare.equalsIgnoreCase(sentence));
        System.out.println("The sentences are lexicographically greater than " + sentence.compareToIgnoreCase(compare));
        System.out.println("Enter the replacement word: ");
        String replacementWord = sc.nextLine();
        String replacement = sentence.replace("World", replacementWord);

        System.out.println("The replacement word is : " + replacement);
        System.out.println("Upper Case version : " + sentence.toUpperCase());
        System.out.println("Lower Case version : " + sentence.toLowerCase());

        System.out.println("Enter an interest rate (e.g., 5.5): ");
        double interestRate = sc.nextDouble();
        String formattedInterestRate = String.format("%.2f", interestRate);
        System.out.println(formattedInterestRate);
    }
}
