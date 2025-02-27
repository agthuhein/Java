package src.Day_19_Polymorphism.Polymorphism;

public class Bird extends Animal_2 {
    public Bird(String name){
        super(name);
        System.out.println("Bird constructor called!");
    }
    void fly(){
        System.out.println("This bird can fly.");
    }
    @Override
    void eat() {
        super.eat();
        System.out.println(name + " the bird is pecking at seeds.");
    }

    @Override
    void makeSound() {
        System.out.println(name + " the bird is chirping..");
    }
}
