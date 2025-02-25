package Day3;

public class Operators_5 {
    public static void main(String[] args) {
        //Unary, Increment, Decrement Operators
        int a = +5;
        int negative = -a;

        System.out.println(a);
        System.out.println(negative);

        //Increment Operator (Post increment)
        int b = a++;
        System.out.println(b);

        int c = ++b;    //Pre increment
        System.out.println(c);
    }
}
