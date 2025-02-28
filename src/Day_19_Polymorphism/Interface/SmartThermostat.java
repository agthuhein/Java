package src.Day_19_Polymorphism.Interface;

public class SmartThermostat implements IControllableDevice{
    private boolean isON = false;
    private double temperature = 25.0;

    @Override
    public void turnOn() {
        isON = true;
        System.out.println("Smart Thermostat is turned on");
    }

    @Override
    public void turnOff() {
        isON = false;
        System.out.println("Smart Thermostat is turned off");
    }

    @Override
    public void getStatus() {
        String status = isON ? "On" : "Off";
        System.out.println("Smart Thermostat status: " + status + "; temperature is: " + temperature + "°C");
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to : " + temperature + "°C");
    }
}
