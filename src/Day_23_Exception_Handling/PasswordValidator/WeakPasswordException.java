package src.Day_23_Exception_Handling.PasswordValidator;

import src.Day_23_Exception_Handling.InsufficientFundsException;

public class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}
