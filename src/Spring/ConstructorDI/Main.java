package src.Spring.ConstructorDI;

public class Main {
    public static void main(String[] args) {
        Engine myEngine = new Engine();
        Car myCar = new Car(myEngine);      //Car only work with engine.

        myCar.drive();
    }
}
