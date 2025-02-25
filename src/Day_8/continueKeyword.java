package Day_8;

public class continueKeyword {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("We ignore this one!!!");
                continue;
            }
            System.out.println(i);
        }
    }
}
