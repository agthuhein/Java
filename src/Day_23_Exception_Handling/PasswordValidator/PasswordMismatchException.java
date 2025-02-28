package src.Day_23_Exception_Handling.PasswordValidator;

public class PasswordMismatchException extends Exception{
    public PasswordMismatchException(String message) {
        super(message);
    }
}
