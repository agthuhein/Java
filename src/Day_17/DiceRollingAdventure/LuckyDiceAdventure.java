package src.Day_17.DiceRollingAdventure;

import java.util.Scanner;

public class LuckyDiceAdventure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Lucky Dice Adventure!");
        System.out.print("Please enter the target score: ");
        int targetScore = sc.nextInt();

        Game game = new Game(targetScore);

        boolean playing = true;

        while(playing){
            System.out.println("Press 'r' to roll the dice, 's' to stop: ");
            char choice = sc.next().charAt(0);
            if(choice == 'r'){
                game.rollDice();
                game.displayScore();
                if(game.isTargetReached()){
                    System.out.println("Congratulations! You've reached the target score!");
                    playing = false;
                }
            }
            else if(choice == 's'){
                System.out.println("You choose to stop the game!");
                game.displayScore();
                playing = false;
            }
            else{
                System.out.println("Wrong choice. Try again.");
            }
        }
        sc.close();
    }
}
