package Day3;
import java.util.Scanner;

public class NextLineBuffer_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine(); //to consume the next line (Enter Key)

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);

        sc.close();
    }
}
