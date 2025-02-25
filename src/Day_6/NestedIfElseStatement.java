package Day_6;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        int number = 7;
        if(number > 0) {
          System.out.println("Number is positive");
        }
        else{
            if(number < 0) {
                System.out.println("Number is negative");
            }
            else{
                System.out.println("Number is zero");
            }
        }
    }
}
