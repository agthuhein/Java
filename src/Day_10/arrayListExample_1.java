package Day_10;
import java.util.ArrayList;

public class arrayListExample_1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");
        fruits.add("Grapes");

        System.out.println(fruits.get(2));
        boolean contains = fruits.contains("apple");
        System.out.println(contains);

        int size = fruits.size();
        System.out.println(size);
        System.out.println(fruits);
        //fruits.remove("Apple");
        fruits.add(0, "Pineapple");
        //System.out.println(fruits);
        System.out.println(fruits.indexOf("Grapes"));

        System.out.println();
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }
}
