package src.Day_11;

import java.util.Scanner;

public class emailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = sc.nextLine();

        if(validateEmail(email)) {
            System.out.println("Email is valid");
        }
        else {
            System.out.println("Email is not valid");
        }
        sc.close();
    }
    public static boolean validateEmail(String email) {
        int atSymbolCounter = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                atSymbolCounter++;
            }
        }
        if (atSymbolCounter != 1) {
            return false;
        }
        int atIndex = email.indexOf("@");
        if (atIndex < 1 || atIndex == email.length() - 1) {
            return false;
        }

        String domainPart = email.substring(atIndex + 1);
        if(!domainPart.contains(".")){
            return false;
        }

        int dotIndex = domainPart.indexOf(".");
        if(dotIndex < 1 || dotIndex == domainPart.length() - 1){
            return false;
        }
        if(email.contains(" ")){
            return false;
        }
        return true;
    }
}
