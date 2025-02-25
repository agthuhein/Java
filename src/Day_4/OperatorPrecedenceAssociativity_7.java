package Day4;

public class OperatorPrecedenceAssociativity_7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        int result = a + b * c;
        System.out.println(result); //20

        result = (a + b) * c;
        System.out.println(result); //30


    }
}
