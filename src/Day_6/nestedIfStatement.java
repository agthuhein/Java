package Day_6;

public class nestedIfStatement {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        if(a > 0){
            if(b > a){
                System.out.println("B is greater than A");
            }
        }

        System.out.println("After if statement");
    }
}
