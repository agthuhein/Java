package src.Day_22;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_Sample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington, D.C");
        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");
        capitals.put("England", "London");

        System.out.println(capitals);

        System.out.println("Capital of Germany is : " + capitals.get("Germany"));
        capitals.replace("USA", "New York");
        System.out.println(capitals);
        capitals.remove("USA");

        System.out.println(capitals);

        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(capitals.containsKey("India"));

        System.out.println("########################################## ");
        System.out.println("########################################## ");

        Map<String, String> capitals2 = new LinkedHashMap<>();
        capitals2.put("USA", "Washington, D.C");
        capitals2.put("Germany", "Berlin");
        capitals2.put("France", "Paris");
        capitals2.put("England", "London");

        System.out.println(capitals2);

        System.out.println("Capital of Germany is : " + capitals2.get("Germany"));
        capitals2.replace("USA", "New York");
        System.out.println(capitals2);
        capitals2.remove("USA");

        System.out.println(capitals2);

        for (Map.Entry<String, String> entry : capitals2.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(capitals2.containsKey("India"));
    }
}
