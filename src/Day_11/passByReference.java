package src.Day_11;

import java.util.Arrays;

public class passByReference {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        System.out.println("Before method call, originalArray[0]: " + originalArray[0]);
        modifyArray(originalArray);
        System.out.println("After method call, originalArray[0]: " + originalArray[0]);
    }
    public static void modifyArray(int[] array) {
        array[0] = 20;
        System.out.println("Inside method, array[0]: " + array[0]);
    }
}
