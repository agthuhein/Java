package Day3;

public class Operators_6 {
    public static void main(String[] args) {
        //Relational Operators
        //Equal Operator
        int a = 10;
        int b = 10;
        boolean result = (a == b);
        System.out.println(result);

        int c = a + b;
        int d = a - b;
        result = (c == d);
        System.out.println(result);

        //Not Equal Operator
        a = 12;
        result = (a != b);
        System.out.println(result);

        result = (a < b);
        System.out.println(result);

        a = 20;
        b = 20;
        result = (a >= b);
        System.out.println(result);

        result = (a >= b);
        System.out.println(result);
    }
}
