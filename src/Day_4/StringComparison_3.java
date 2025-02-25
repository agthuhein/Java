package Day4;

public class StringComparison_3 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("java");

        //Comparing references
        System.out.println(str1 == str2);   //Return boolean statement  //true


        System.out.println(str1 == str3);   //false

        //Comparing the value of the Strings variables. //Using equals() method
        System.out.println(str1.equals(str2));  //true
        System.out.println(str1.equals(str3));  //true

        //EqualIgnoreCare
        String str4 = "Java";
        System.out.println(str4.equalsIgnoreCase(str3));    //true  //ignoring the case sensitivity

        //------------------------------------------------------
        //compareTo() return int value. -1 when one is lexicographically greater
        String animal1 = "Zat";
        String animal2 = "Aog";
        String animal3 = "Cat";

        System.out.println("Comparing aniaml 1 and 2 using comapreTo " + animal1.compareTo(animal2));
        System.out.println("Comparing aniaml 1 and 3 using comapreTo " + animal1.compareTo(animal3));
        System.out.println("Comparing aniaml 2 and 1 using comapreTo " + animal2.compareTo(animal1));
    }
}
