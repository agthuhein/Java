package src.Spring.SetterDI;

public class Car {
    private Engine engine;

    //Setter Dependency Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void Drive(){
        engine.Start();
        System.out.println("Driving Car. SetterDI");
    }
}
