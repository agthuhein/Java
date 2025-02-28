package src.Day_22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter paragraph: ");
        String paragraph = scanner.nextLine();

        String normalizedText = normalizeText(paragraph);

        String[] words = normalizedText.split(" ");

        HashMap<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()){
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
        String mostFrequentWord = null;
        Iterator<Map.Entry<String,Integer>> iterator = wordFrequency.entrySet().iterator();
        int maxFrequency = 0;
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        if (mostFrequentWord != null) {
            System.out.println("Most frequent word: " + mostFrequentWord + " with frequency: " + maxFrequency);
        }
        else {
            System.out.println("No most frequent word");
        }
        scanner.close();
    }
    public static String normalizeText(String paragraph) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);
            if(Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                builder.append(Character.toLowerCase(c));
            }
        }
        return builder.toString();
    }
}
