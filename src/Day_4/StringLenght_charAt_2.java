package Day4;

public class StringLenght_charAt_2 {
    public static void main(String[] args) {
        String quote = "to be or not to be";
        int length = quote.length();        //got no. of characters in the string
        System.out.println(length);

        String quoted = "May the force be with you";
        char firstChar = quoted.charAt(0);
        char tenthChar = quoted.charAt(9);
        System.out.println(firstChar);
        System.out.println(tenthChar);
    }
}
