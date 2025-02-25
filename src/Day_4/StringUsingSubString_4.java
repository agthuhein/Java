package Day4;

public class StringUsingSubString_4 {
    public static void main(String[] args) {
        String phrase = "Programming in Java";
        String word1 = phrase.substring(5);     //from 5th onward
        System.out.println(word1);

        String word2 = phrase.substring(0,5);              //from 0 to 5th
        System.out.println(word2);

        String word3 = phrase.substring(15);    //from 15th onward
        System.out.println(word3);
    }
}
