package src.Spring.ConstructorDI;

public class Car {
    private Engine engine;

    //Constructor Dependency Injection
    public Car(Engine engine){
        this.engine = engine;
    }
    public void drive(){
        engine.Start();
        System.out.println("Driving");
    }
}
