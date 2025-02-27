package src.Day_18_Inheritance.WordGuessingGame;

public class Game {
    protected String wordToGuess;
    protected int attempts;
    protected char[] revealedLetters;

    public Game(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        attempts = 0;
        revealedLetters = new char[wordToGuess.length()];
        for (int i = 0; i < revealedLetters.length; i++) {
            revealedLetters[i] = '-';
        }
    }
    public void playGame(){
        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("You will be given hints to guess the word.");
    }

    public void displayHints(){
        System.out.println("HINT: The word has " + wordToGuess.length() + " letters.");
    }
    public String getRevealedWords(){
        return new String(revealedLetters);
    }
}
