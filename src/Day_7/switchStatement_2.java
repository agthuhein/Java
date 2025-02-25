package Day_7;

public class switchStatement_2 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good Job!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("Passed!");
                break;
            case 'F':
                System.out.println("Failed!");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }
}
