package Day_8;

import java.util.Scanner;

public class controllingLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;

        String vowelList = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            System.out.println("Do you want to continue? (yes to continue, no to exit)");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
            if (!Character.isLetter(ch)) {
                continue;
            }
            if (vowelList.indexOf(ch) != -1){
                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);

        scanner.close();
    }
}
