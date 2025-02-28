package src.Day_19_Polymorphism.EncapsulationExample;

public class UserProfile {
    private String username;
    private String password;
    private String email;

    public UserProfile(String username, String password, String email) {
        this.username = username;
        setPassword(password);  //Use setter to apply validation
        setEmail(email);
    }

    public void setEmail(String email) {
        if(isValidEmail(email)) {
            this.email = email;
        }
        else {
            System.out.println("Invalid email");
        }
    }

    public String getUsername() {
        return username;
    }
    public void setPassword(String password)
    {
        if(isValidPassword(password)){
            this.password = password;
            System.out.println("Password set is successful");
        }
        else {
            System.out.println("Invalid password");
        }
    }

    public String getEmail() {
        return email;
    }
    private boolean isValidPassword(String password) {
        return password.length() >= 8;
    }
    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
    public void displayUserInfo(){
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }

}
