package src.Day_21;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_Sample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        //Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Pineapple");

        System.out.println("The first fruit is: " + fruits.getFirst());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("##############################");
        //
        LinkedList<String> fruits1= new LinkedList<>();
        fruits1.addFirst("Blueberry");
        fruits1.addLast("Strawberry");
        for (String fruit : fruits1) {
            System.out.println(fruit);
        }
    }
}
