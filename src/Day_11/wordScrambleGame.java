package src.Day_11;

import java.util.Random;
import java.util.Scanner;

public class wordScrambleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] wordList = {"magic","wizard","spell","potion","alchemy","sorcery","wand","dragon","cauldron","broomstick"};

        int playerScore = 0;
        boolean keepPlaying = true;
        System.out.println("Welcome to the word scramble game!");
        System.out.println("Unscramble the magic words to score points!");

        //game loop
        while (keepPlaying) {
            String word = wordList[rand.nextInt(wordList.length)];  //get random word from wordList
            String scrambledWord = scrambleWord(word, rand);        //scramble that word
            System.out.println("Scrambled word: " + scrambledWord);
            boolean wordGuessed = false;
            int attempts = 3;
            while (attempts > 0 && !wordGuessed) {
                System.out.print("Your guess: ");
                String playerGuess = sc.nextLine();

                if(playerGuess.equalsIgnoreCase(word)) {
                    System.out.println("Congratulations! You guessed correctly!");
                    playerScore++;
                    wordGuessed = true;
                }
                else {
                    attempts--;
                    System.out.println("Wrong! Attempts remaining: " + attempts);
                }
            }
            if(!wordGuessed) {
                System.out.println("The correct word is: " + word);
            }
            System.out.println("Your current score:  " + playerScore);
            System.out.print("Do you want to play again? (Y/N): ");
            String response = sc.nextLine();
            keepPlaying = response.equalsIgnoreCase("yes");

        }
        System.out.println("Thank you for playing! Your final score is: " + playerScore);
        sc.close();
    }
    public static String scrambleWord(String word, Random rand) {
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < wordArray.length; i++) {
            int j = rand.nextInt(wordArray.length);
            char temp = wordArray[i];
            wordArray[i] = wordArray[j];
            wordArray[j] = temp;

        }
        return new String(wordArray);
    }
}
