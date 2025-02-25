package Day2;

public class TypeCasting_7 {
    public static void main(String[] args) {
        //Implicit
        int numInt = 10;
        System.out.println(numInt);         //10

        double numDouble = numInt;
        System.out.println(numDouble);      //10.0

        //Explicit
        double numDouble2 = 10.5;
        System.out.println(numDouble2);     //10.5

        int numInt2 = (int) numDouble2;
        System.out.println(numInt2);        //10

        int result = 1 / 2;
        System.out.println(result);         //actually the result is 0.5. But it print 0.

        double result2 = 1 / 2;
        System.out.println(result2);        //0.0

        result2 = 1.0 / 2.0;
        System.out.println(result2);        //0.5
    }
}
