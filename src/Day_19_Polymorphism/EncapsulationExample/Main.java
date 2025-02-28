package src.Day_19_Polymorphism.EncapsulationExample;

public class Main {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("John", "asklfa;sdlfkjads", "john@gmail.com");

        //user.displayUserInfo();
        //user.setPassword("123aedfeafeef");

        user.setEmail("john_12345gma@il.com");

        user.displayUserInfo();
    }
}
