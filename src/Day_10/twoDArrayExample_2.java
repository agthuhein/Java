package Day_10;

public class twoDArrayExample_2 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},
                        {4,5,6},
                        {7,8,9}};

        for (int[] rows : array) {
            for (int num : rows) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
