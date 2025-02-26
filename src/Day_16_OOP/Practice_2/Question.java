package src.Day_16_OOP.Practice_2;

import java.util.Random;

public class Question {
    private int operand1;
    private int operand2;
    private char operator;
    private double correctAnswer;

    public Question() {
        Random rand = new Random();
        this.operand1 = rand.nextInt(100) + 1;
        this.operand2 = rand.nextInt(100) + 1;
        char[] operators = {'+', '-', '*', '/'};
        this.operator = operators[rand.nextInt(4)];
        calculateAnswer();
    }
    public void generateQuestion() {
        System.out.println("What is " + operand1 + " " + operator+ " " + operand2 + "?");
    }
    public void calculateAnswer() {
        switch (operator) {
            case '+':
                correctAnswer = operand1 + operand2;
                break;
            case '-':
                correctAnswer = operand1 - operand2;
                break;
            case '*':
                correctAnswer = operand1 * operand2;
                break;
            case '/':
                correctAnswer = (double) operand1 / operand2;
                break;
        }
    }
    public boolean checkAnswer(double userAnswer) {
        return Math.abs(userAnswer - correctAnswer) < 0.001;
    }

}
