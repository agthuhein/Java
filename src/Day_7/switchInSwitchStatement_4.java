package Day_7;

import java.util.Scanner;

public class switchInSwitchStatement_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a or b: ");
        String choice = input.nextLine();

        switch (choice) {
            case "a":
                System.out.println("Now choose 1 or 2");
                String choice1 = input.nextLine();
                switch (choice1) {
                    case "1":
                        System.out.println("Thanks for choosing 1.");
                        break;
                    case "2":
                        System.out.println("Thanks for choosing 2.");
                        break;
                    default:
                        System.out.println("You chose wrongly.");
                        break;
                }
                break;
            case "b":
                System.out.println("B is inferior");
                break;
            default:
                System.out.println("You entered invalid input");
                break;
        }

        input.close();
    }
}
