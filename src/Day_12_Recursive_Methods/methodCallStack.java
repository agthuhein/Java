package src.Day_12_Recursive_Methods;

public class methodCallStack {
    public static void main(String[] args) {
        makeSandwich();
    }
    public static void getSlicesOfBread(){
        buyBread();
        System.out.println("Got two slices of bread");
    }
    public static void buyBread(){
        System.out.println("Bought two slices of bread");
    }
    public static void spreadPeanutButter(){
        System.out.println("Spread Peanut Butter on one slice.");
    }
    public static void spreadJelly(){
        System.out.println("Spread Jelly on other slice.");
    }
    public static void putSlicesTogether(){
        System.out.println("Put Slices");
    }
    public static void makeSandwich(){
        getSlicesOfBread();
        spreadPeanutButter();
        spreadJelly();
        putSlicesTogether();
        System.out.println("Sandwich is ready!");
    }
}
