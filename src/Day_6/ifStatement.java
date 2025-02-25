package Day_6;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isSunny = true;

        int a = -5;

        String name = scanner.nextLine();

        if(name.equals("Denis")) {
            System.out.println("We have a positive number");
        }
        System.out.println("Outside of any condition");
        scanner.close();
    }
}
