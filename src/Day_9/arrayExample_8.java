package Day_9;

import java.util.Arrays;

public class arrayExample_8 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        System.out.println(Arrays.toString(nums));
        //Arrays.fill(nums, 10);      //fill entire array with 10
        Arrays.fill(nums, 0, 3, 10);
        Arrays.fill(nums, 3, 5, 13);
        System.out.println(Arrays.toString(nums));

        //Equal Methods
        int[] myNums = {10,10,10,11,11};
        System.out.println(Arrays.equals(myNums, nums));    //True, if the arrays are same. Otherwise, false
        System.out.println(Arrays.toString(myNums));
    }
}
