package Day_6;

public class TernaryOperator {
    public static void main(String[] args) {
        // Condition ? Expression 1 : Expression 2
    /*
        int age = 10;
        double discount = (age < 18) ? 0.10: 0.05;

        System.out.println("The discount is " + discount * 100 + "%");

     */
        int score = 85;
        char grade = (score >=90) ? 'A'
                : (score >=80) ? 'B'
                : (score >= 70) ?
                'C' : 'D';
        System.out.println(grade);
    }
}
