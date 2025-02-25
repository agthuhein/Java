package Day_8;

import java.util.Scanner;

public class starPyramidBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of level : ");
        int level = scanner.nextInt();

        for (int i = 1; i <= level; i++) {
            for (int j = 0; j < level - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
