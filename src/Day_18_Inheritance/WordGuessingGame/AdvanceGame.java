package src.Day_18_Inheritance.WordGuessingGame;

import java.util.Random;

public class AdvanceGame extends InputGame{
    private Random random;

    public AdvanceGame(String wordToGuess){
        super(wordToGuess);
        this.random = new Random();
    }

    @Override
    public void displayHints() {
        super.displayHints();
        if(attempts > 0){
            revealedRandomLetters();
            System.out.println("Revealed so far: " + getRevealedWords());
        }
    }
    private void revealedRandomLetters(){
        int index;
        do{
            index = random.nextInt(wordToGuess.length());
        }while (revealedLetters[index] != '-');
        revealedLetters[index] = wordToGuess.charAt(index);
    }
}
