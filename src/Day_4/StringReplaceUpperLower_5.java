package Day4;

import java.util.Locale;

public class StringReplaceUpperLower_5 {
    public static void main(String[] args) {
        String phrase = "The quick brown fox jumps over the lazy dog";

        String newPhrase = phrase.replace("quick", "brown");
        String newPhrase2 = phrase.replace("o","a");

        System.out.println(newPhrase);
        System.out.println(newPhrase2);


        //Upper
        String toUpperString = "The quick brown fox jumps over the lazy dog";
        System.out.println(toUpperString.toUpperCase());
        System.out.println(toUpperString.toLowerCase());
    }
}
