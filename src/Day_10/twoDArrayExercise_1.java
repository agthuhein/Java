package Day_10;

import java.util.Scanner;

public class twoDArrayExercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of rows and columns: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Please enter the values for row " + i + " and column " + j + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        System.out.println("The sum is: " + sum);

        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if(i != n-1-i){
                sum += matrix[i][n - 1 - i];
            }

        }
        System.out.println("The sum of both diagonal is: " + sum);
        scanner.close();
    }
}
