package Day_9;
import java.util.Arrays;

public class arrayExample_6 {
    public static void main(String[] args) {
        int[] num = {2, 5, 1, 3, 4, 7, 3, 8};
        System.out.println("Before Sort " + Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("After Sort " + Arrays.toString(num));
        int result = Arrays.binarySearch(num, 7);       //need to sort the array before calling binarySearch()
        System.out.println("Index 7 is at: " + result);     //if index is wth -, it is not exit in the array
    }
}
