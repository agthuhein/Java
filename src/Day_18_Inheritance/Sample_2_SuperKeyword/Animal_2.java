package src.Day_18_Inheritance.Sample_2_SuperKeyword;

public class Animal_2 {
    String name;
    public Animal_2(String name) {
        this.name = name;
        System.out.println("Animal_2 constructor called. The name is " + name);
    }
    void eat(){
        System.out.println("Animal eats.");
    }
}
