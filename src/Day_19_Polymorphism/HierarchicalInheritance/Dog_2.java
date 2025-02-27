package src.Day_19_Polymorphism.HierarchicalInheritance;

public class Dog_2 extends Animal_2 {
    String breed;

    public Dog_2(String name, String breed) {
        super(name);
        this.breed = breed;
        System.out.println("Dog_2 constructor called. The breed is " + breed);
    }
    void bark(){
        System.out.println("This dog barks.");
    }
    //Hide eat method of parent
    @Override
    void eat() {
        super.eat();
        System.out.println("Dog_2 eats.");
    }
    void animalEat(){
        super.eat();
    }
    @Override
    void makeSound(){
        System.out.println(name + " the dog is barking.");
    }

    void fetch(){
        System.out.println(name + " the dog is fetching the ball.");
    }
}
