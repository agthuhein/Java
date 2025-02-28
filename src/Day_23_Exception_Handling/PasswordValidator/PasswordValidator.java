package src.Day_23_Exception_Handling.PasswordValidator;

public class PasswordValidator {
    public void validatePassword(String password, String confirmPassword)
            throws PasswordMismatchException, WeakPasswordException {
        if(password.length() < 8){
            throw new WeakPasswordException("Password must be at least 8 characters long.");
        }
        if(password.length() > 20){
            throw new WeakPasswordException("Password must not exceed 20 characters.");
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*()_+";

        for(char ch : password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
            else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }
            else if(Character.isDigit(ch)){
                hasDigit = true;
            }
            else if (specialCharacters.indexOf(ch) >= 0){
                hasSpecialChar = true;
            }
        }
        if(!hasUpperCase){
            throw new WeakPasswordException("Password must contain at least one upper case letter.");
        }
        if(!hasLowerCase){
            throw new WeakPasswordException("Password must contain at least one lower case letter.");
        }
        if(!hasDigit){
            throw new WeakPasswordException("Password must contain at least one digit number.");
        }
        if(!hasSpecialChar){
            throw new WeakPasswordException("Password must contain at least one special character.");
        }
        if(!password.equals(confirmPassword)){
            throw new PasswordMismatchException("Passwords do not match.");
        }
    }
}
