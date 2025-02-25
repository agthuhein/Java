package src.Day_11;

public class passByValue {
    public static void main(String[] args) {
        int number = 10;
        modifyPrimitve(number);
        System.out.println(number);
    }
    public static void modifyPrimitve(int number) {
        number = 20;
        System.out.println(number);
    }
}
