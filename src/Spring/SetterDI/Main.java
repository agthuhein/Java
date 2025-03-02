package src.Spring.SetterDI;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car();


        //If you don't set the engine before drive. You will get NullPointerException
        car.setEngine(engine);
        car.Drive();

        ElectricEngine electricEngine = new ElectricEngine();
        car.setEngine(electricEngine);
        car.Drive();
    }
}
