package src.Day_19_Polymorphism.HierarchicalInheritance;

public class Main_2 {
    public static void main(String[] args) {
        Dog_2 myDog = new Dog_2("Buddy", "Golden Retriever");
        myDog.eat();    //Overridden eat method
        myDog.makeSound();  //Dog-Specific Sound
        myDog.fetch();  //Dog-Specific behavior
        myDog.sleep();  //Inherited from Animal

        System.out.println("################################################");

        Bird myBird = new Bird("Peacock");
        myBird.eat();    //Overridden eat method
        myBird.makeSound();  //Bird-Specific Sound
        myBird.fly();  //Bird-Specific behavior
        myBird.sleep();  //Inherited from Animal
    }
}
