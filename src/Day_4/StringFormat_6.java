package Day4;

public class StringFormat_6 {
    public static void main(String[] args) {
        String name = "John Doe";
        int age = 18;
        String message = String.format("Hello, %s! You are %d years old.", name, age);  //%s - string, %d - integer
        System.out.println(message);

        double price = 1234.567;
        String formattedPrice = String.format("The price is $%.2f", price);
        System.out.println(formattedPrice);
    }
}
