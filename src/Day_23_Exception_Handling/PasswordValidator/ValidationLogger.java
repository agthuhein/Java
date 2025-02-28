package src.Day_23_Exception_Handling.PasswordValidator;

public class ValidationLogger implements AutoCloseable{
    private static boolean hasLoggedCompletion = false;

    public void log(String status, String message){
        System.out.printf("Status: %s | Message: %s%n", status, message);
    }

    public void logSuccess(){
        log("SUCCESS", "The password meets all security criteria");
    }
    public void logFailure(String reason){
        log("FAILED", reason);
    }

    @Override
    public void close() throws Exception {
        if(!hasLoggedCompletion){
            log("INFO", "The password validation process completed");
            hasLoggedCompletion = true;
        }
    }
}
