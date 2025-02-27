package src.Day_18_Inheritance.Sample_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();    //Dog IS-A Animal
        dog.eat();
        dog.bark();

        Animal animal = new Animal();
        animal.eat();

        Bird bird = new Bird();
        bird.fly();
        bird.eat();
    }
}
