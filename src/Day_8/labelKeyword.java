package Day_8;

public class labelKeyword {
    public static void main(String[] args) {
        outerLoop:      //label
        for (int i = 1; i <= 3; i++) {
            innerLoop:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outerLoop;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
