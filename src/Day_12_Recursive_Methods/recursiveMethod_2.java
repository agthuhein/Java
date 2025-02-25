package src.Day_12_Recursive_Methods;

public class recursiveMethod_2 {
    public static void main(String[] args) {
        countDown(5);
    }
    public static void countDown(int number) {
        if(number <= 0){
            System.out.println("Done!");
        }
        else{
            System.out.println(number);
            //countDown(number);  //Bug: this will cause infinite recursion
            countDown(number-1);
        }
    }
}
