package Day_10;

public class twoDArrayExample_3 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},
                {4,5,6},
                {7,8,9,10,11,12,13,0}};

        int largest = array[0][0];
        int smallest = array[0][0];
        for (int[] rows : array) {
            for (int num : rows) {
                if (num > largest) {
                    largest = num;
                }
                if (num < smallest) {
                    smallest = num;
                }

            }
        }
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
    }
}
