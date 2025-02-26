package src.Day_14_BinarySearch;

public class binarySearchExercise {
    public static void main(String[] args) {
        int[] sortedArray = {1,3,5,7,9,11,13,15,17,19};
        int target = 3;

        int result = binarySearch(sortedArray, target);

        if(result == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Found at index: " + result);
        }
    }
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if(array[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
