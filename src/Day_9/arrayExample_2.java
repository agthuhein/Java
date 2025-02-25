package Day_9;

public class arrayExample_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(arr.length);
        for(int i=0; i< arr.length; i++){       //arr.length, the array is iterated til its last item.
            arr[i] = arr[i] * 2;
            System.out.println(arr[i]);
        }
    }
}
