package Day_9;

public class arrayExample_3 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array length is: " + numbers.length);
        int counter = 0;
        for(int num : numbers){
            System.out.println("Counter is: " + counter++);
            System.out.println(num);
        }

        String[] friends = {"MPS", "YKP", "OD", "KLT"};
        for(String friend : friends){
            System.out.println("Welcome to my party: " + friend);
        }
    }
}
