package src.Day_23_Exception_Handling;

public class Throwing_Sample {
    public static void main(String[] args) {
        try{
            validatePassword("");
        }catch(IllegalArgumentException e){
            System.out.println("Don't leave password empty!");
        }

    }
    public static void validatePassword(String password) {
        if(password == null || password.isEmpty()){
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
    }
}
