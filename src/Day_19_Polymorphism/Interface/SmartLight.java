package src.Day_19_Polymorphism.Interface;

public class SmartLight implements IControllableDevice{
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("SmartLight is turned on!");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("SmartLight is turned off!");
    }

    @Override
    public void getStatus() {
        String status = isOn ? "On" : "Off";
        System.out.println("SmartLight status: " + status);
    }
}
