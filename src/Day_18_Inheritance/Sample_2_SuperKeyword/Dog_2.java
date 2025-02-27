package src.Day_18_Inheritance.Sample_2_SuperKeyword;

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
        System.out.println("Dog_2 eats.");
    }
    void animalEat(){
        super.eat();
    }
}
