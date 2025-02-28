package src.Day_23_Exception_Handling;

public class InsufficientFundsException extends Exception {
    //Custom Exception
    public InsufficientFundsException(String message) {
        super(message);
        System.out.println("InsufficientFundsException was caught: " + message);
    }
}
