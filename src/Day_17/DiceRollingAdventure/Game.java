package src.Day_17.DiceRollingAdventure;

public class Game {
    private Dice dice1;
    private Dice dice2;
    private int score;
    private int targetScore;

    public Game(int targetScore){
        this.dice1 = new Dice();
        this.dice2 = new Dice();
        this.score = 0;
        this.targetScore = targetScore;
    }
    public void rollDice(){
        dice1.roll();
        dice2.roll();

        System.out.println("Dice 1: " + dice1.getValue());
        System.out.println("Dice 2: " + dice2.getValue());

        this.score += this.dice1.getValue() + this.dice2.getValue();

        if(dice1.getValue() == dice2.getValue()){
            System.out.println("You rolled a double! Bonus points added.");
            this.score += 10;

        }
    }
    public void displayScore(){
        System.out.println("Current Score: " + this.score);
        System.out.println("Target Score: " + this.targetScore);
    }
    public boolean isTargetReached(){
        return this.score >= targetScore;
    }
}
