package Day_9;
import java.util.Arrays;

public class arrayExample_5 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 3, 4, 7, 3, 8};
        String[] name = {"Frank", "Tank", "Crank"};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(name));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }
}
