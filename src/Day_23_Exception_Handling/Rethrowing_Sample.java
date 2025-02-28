package src.Day_23_Exception_Handling;

public class Rethrowing_Sample {
    public static void main(String[] args) {
        try {
            handleUserRegistration("JohnDoe", "password12345");
            handleUserRegistration("JaneDoe", "");
        }catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
    public static void handleUserRegistration(String username, String password) throws Exception {
        try{
            validatePassword(password);
            System.out.println("User " + username+ " registered successfully.");
        }catch(IllegalArgumentException e){
            System.out.println("Error in handleUserRegistration: " + e.getMessage());
            throw new Exception("Registration failed for user: " + username, e);    //Checked Exception
        }
    }
    public static void validatePassword(String password) {
        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be null or empty");     //Unchecked Exception
        }
    }
}
