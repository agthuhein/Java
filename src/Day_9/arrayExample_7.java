package Day_9;

import java.util.Arrays;

public class arrayExample_7 {
    public static void main(String[] args) {
        int[] number = {2, 5, 1, 3, 4, 7, 3, 8};

        //int[] backupOfNumber = number;      //it is not copying the number array. It is referring to the same array in memory. By reference. not by value.
        int[] backupOfNumber = Arrays.copyOf(number, number.length);
        int[] lessNumbers = Arrays.copyOf(number, 5);

        System.out.println("Before Sort " + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("After Sort " + Arrays.toString(number));
        int result = Arrays.binarySearch(number, 7);       //need to sort the array before calling binarySearch()
        System.out.println("Index 7 is at: " + result);     //if index is wth -, it is not exit in the array
        System.out.println("Backup of numbs" + Arrays.toString(backupOfNumber));
        System.out.println("Less Number" + Arrays.toString(lessNumbers));
    }
}
