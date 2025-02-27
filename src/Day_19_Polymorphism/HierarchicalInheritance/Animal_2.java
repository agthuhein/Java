package src.Day_19_Polymorphism.HierarchicalInheritance;

public class Animal_2 {
    String name;
    public Animal_2(String name) {
        this.name = name;
        System.out.println("Animal_2 constructor called.");
    }
    void eat(){
        System.out.println("Animal eats.");
    }
    void sleep(){
        System.out.println(name + " is sleeping.");
    }
    void makeSound(){
        System.out.println(name + " makes sound.");
    }
}
