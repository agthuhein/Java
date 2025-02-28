package src.Day_23_Exception_Handling.PasswordValidator;

import java.util.Scanner;
import src.Day_23_Exception_Handling.PasswordValidator.WeakPasswordException;
import src.Day_23_Exception_Handling.PasswordValidator.PasswordMismatchException;
import src.Day_23_Exception_Handling.PasswordValidator.PasswordValidator;
import src.Day_23_Exception_Handling.PasswordValidator.WeakPasswordException;

public class UserRegistration {
    public void registerUser(String password, String confirmPassword) throws Exception {
        try(ValidationLogger logger = new ValidationLogger()){
            PasswordValidator validator = new PasswordValidator();
            validator.validatePassword(password, confirmPassword);
            logger.logSuccess();
        }catch (WeakPasswordException | PasswordMismatchException e){
            try(ValidationLogger logger = new ValidationLogger()){
                logger.logFailure(e.getMessage());
            }
        }finally {
            try(ValidationLogger logger = new ValidationLogger()){
                logger.close();
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        System.out.println("Please enter your confirm password: ");
        String confirmPassword = scanner.nextLine();

        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.registerUser(password, confirmPassword);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
