package src.Day_16_OOP.Practice_2;

import java.util.Scanner;

public class MathQuiz {
    private int score;

    public MathQuiz(){
        this.score = 0;
    }

    public void startQuiz(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            askQuestion(sc);
        }
        System.out.println("Your final score is : " + score + "/5");
        sc.close();
    }
    public void askQuestion(Scanner scanner){
        Question question = new Question();
        question.generateQuestion();
        System.out.println("Your answer");
        double userAnswer = scanner.nextDouble();
        if(question.checkAnswer(userAnswer)){
            System.out.println("Congratulations! You have been correct!");
            score++;
        }
        else{
            System.out.println("Sorry, you have not been correct!");
        }
    }
}
