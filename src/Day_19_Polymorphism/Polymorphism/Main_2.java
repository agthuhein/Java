package src.Day_19_Polymorphism.Polymorphism;

public class Main_2 {
    public static void main(String[] args) {
        Dog_2 myDog = new Dog_2("Buddy", "Golden Retriever");
        //Polymorphism
        Animal_2 myDog2 = new Dog_2("Jenny", "Collie");
        myDog.makeSound();
        //Polymorphic methods call
        myDog2.makeSound();

        //direct call of subclass specific method
        //require casting to the appropriate subclass
        ((Dog_2) myDog2).fetch();
    }
}
