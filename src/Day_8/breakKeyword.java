package Day_8;

public class breakKeyword {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("WE GOTCHA!!!");
                break;
            }
            System.out.println(i);
        }
    }
}