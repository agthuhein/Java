package Day_7;

import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Ultimate Adventure Game!");
        System.out.println("Your goal is to find the hidden treasure. Choose wisely");

        System.out.println("You are at a crossroad. Do you want to go left or right? ");
        System.out.println("Type 'left' or 'right': ");

        String choiceOne = scanner.nextLine().toLowerCase();

        switch (choiceOne) {
            case "left":
                System.out.println("You walk down a dark path and find a mysterious cave.");
                System.out.println("Do you want to enter the cave or walk past it?");
                System.out.println("Type 'enter' or 'walk': ");
                String choiceTwo = scanner.nextLine().toLowerCase();
                switch (choiceTwo) {
                    case "enter":
                        System.out.println("Inside the cave, you find a sleeping dragon!");
                        System.out.println("Do you want to fight the dragon or sneak past it?");
                        System.out.println("Type 'fight' or 'sneak': ");
                        String choiceThree = scanner.nextLine().toLowerCase();
                        switch (choiceThree) {
                            case "fight":
                                System.out.println("You bravely fight the dragon and ...");
                                System.out.println("You are victorious! The dragon guards the treasure. You win!");
                                break;
                            case "sneak":
                                System.out.println("You sneak past the dragon and find the treasure behind it. You win!");
                                break;
                            default:
                                System.out.println("Invalid choice. You got caught by the dragon and lost!");
                                break;
                        }
                        break;
                    case "walk":
                        System.out.println("You walk past the cave and fall into a hidden trap. Game over!");
                        break;
                    default:
                        System.out.println("Invalid choice. You got lost in the wilderness. Game over!");
                        break;
                }
                break;
            case "right":
                System.out.println("You walk through a dense forest and find a river.");
                System.out.println("Do you want to swim across or build a raft?");
                System.out.println("Type 'swim' or 'raft': ");
                String choiceFour = scanner.nextLine().toLowerCase();
                switch (choiceFour) {
                    case "swim":
                        System.out.println("You swim across the river and encounter a wild bear!");
                        System.out.println("Do you want to run away or clim a tree?");
                        System.out.println("Type 'run' or 'climb': ");
                        String choiceFive = scanner.nextLine().toLowerCase();
                        switch (choiceFive) {
                            case "run":
                                System.out.println("You run away safely and find a hidden path to the treasure. You win!");
                                break;
                            case "climb":
                                System.out.println("You climb the tree, but the bear waits for you. You are stuck. Game over!");
                                break;
                            default:
                                System.out.println("Invalid choice. The bear catches you. Game over!");
                                break;
                        }
                        break;
                    case "raft":
                        System.out.println("You build a raft and safely cross the river. You find the treasure on the other side of the river. You win!");
                        break;
                    default:
                        System.out.println("Invalid choice. You got swept away by the river. Game over!");
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice. You got lost in the game.");
                break;
        }


        scanner.close();
    }
}
