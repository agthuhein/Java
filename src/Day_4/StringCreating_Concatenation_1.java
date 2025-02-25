package Day4;

public class StringCreating_Concatenation_1 {
    public static void main(String[] args) {
        String morning = "Good Morning";
        System.out.println(morning);

        String night = new String("Good Night");
        night = "Bad Night";        //Override
        System.out.println(night);

        String firstName = "Aung Thu";
        String lastName = "Hein";
        String fullName = firstName + " " + lastName;    //String concatenation
        int age = 18;
        String bio = "I am " + fullName + " and am " + age + " years old.";
        System.out.println(bio);
    }
}
