package src.Day_18_Inheritance.WordGuessingGame;

import java.util.Random;

public class WordGuessingGame {
    public static void main(String[] args) {
        String[] wordPoll = {"inheritance", "polymorphism", "encapsulation", "abstraction", "interface"};

        Random random = new Random();

        String wordToGuess = wordPoll[random.nextInt(wordPoll.length)];
        AdvanceGame game = new AdvanceGame(wordToGuess);
        game.playGame();
    }
}
