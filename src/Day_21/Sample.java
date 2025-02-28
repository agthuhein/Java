package src.Day_21;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        System.out.println("Array List");
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

        System.out.println("##############################");
        Vector<String> fruits2= new Vector<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Orange");
        fruits2.add("Grape");
        fruits2.addFirst("Pineapple");
        for (String fruit : fruits2) {
            System.out.println(fruit);
        }
        System.out.println("##############################");
        System.out.println("@@@Stack@@@");
        Stack<String> fruits3= new Stack<>();
        fruits3.push("Apple");
        fruits3.push("Banana");
        fruits3.push("Orange");
        fruits3.push("Grape");
        fruits3.push("Pineapple");

        for (String fruit : fruits3) {
            System.out.println(fruit);
        }
        String topElement = fruits3.peek();
        System.out.println("Top Element: " + topElement);

        String popElement = fruits3.pop();
        System.out.println("Pop Element: " + popElement);

        System.out.println("After pop: ");
        for (String fruit : fruits3) {
            System.out.println(fruit);
        }
        int position = fruits3.search("Apple");
        if (position == -1) {
            System.out.println("Apple not found");
        }
        else {
            System.out.println("Apple found at position " + position);
        }

        System.out.println("Is the stack empty? " + fruits3.isEmpty());

        System.out.println("###############################");
        System.out.println("@@@HashSet@@@");

        HashSet<String> set= new HashSet<>();
        set.add("First");
        set.add("Second");
        set.add("Third");
        set.add("Fourth");
        //set.add("First");
        System.out.println("HashSet after addition" + set);
        boolean containFirst = set.contains("First");
        System.out.println("contains First: " + containFirst);
        set.remove("First");
        System.out.println("Removed First: " + set);
        System.out.println("Size of HashSet: " + set.size());

        for (String sets : set) {
            System.out.println(sets);
        }
        set.clear();
        System.out.println("Size of HashSet after clearing: " + set.size());
    }
}
