package src.Day_22;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Sample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
