package src.Day_19_Polymorphism.Interface;

public interface IControllableDevice {
    void turnOn();
    void turnOff();

    default void getStatus() {
        System.out.println("Status: Unknown");
    }

}
