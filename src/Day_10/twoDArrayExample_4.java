package Day_10;

public class twoDArrayExample_4 {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum = 0;
        for (int[] rows : array) {
            for (int anInt : rows) {
                sum += anInt;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
