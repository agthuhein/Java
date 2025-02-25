package src.Day_11;

import java.util.Random;

public class randomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber = random.nextInt(100);   //Range between 0-99
        int myRandomNumber2 = random.nextInt(5, 10);    //Range between 5 and 9
        System.out.println("Random number is: " + myRandomNumber);
        System.out.println("Random number is: " + myRandomNumber2);
    }
}
