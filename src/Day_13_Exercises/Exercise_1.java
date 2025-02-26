package src.Day_13_Exercises;

import java.util.Arrays;

public class Exercise_1 {
    public static void main(String[] args) {
        int[] numbers = {4,5,9,4,2,2,8,9,1,3,6,1};
        int[] uniqueArray = removeDuplicates(numbers);
        System.out.println("Array with duplicate removes: " + Arrays.toString(uniqueArray));

    }
    public static int[] removeDuplicates(int[] array) {
        if(array == null || array.length <= 1){
            return array;
        }
        Arrays.sort(array);

        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] != array[i+1]){
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length-1];

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
