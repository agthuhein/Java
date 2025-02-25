package Day3;

public class Operators_7 {
    public static void main(String[] args) {
        //Compound Operators
        //Addition Assignment
        int a = 5;
        System.out.println(a);
        a += 3; //a = a + 3;
        System.out.println("After addition Assignment : " + a);

        //Subtraction Assignment
        a -= 3;
        System.out.println("After subtraction Assignment : " + a);

        a *= 2;
        System.out.println("After multiplication Assignment : " + a);

        a /= 3;
        System.out.println("After division Assignment : " + a);

        a %= 2;
        System.out.println("After modulo Assignment : " + a);
    }
}
