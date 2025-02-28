package src.Day_19_Polymorphism.Interface;

public class Main {
    public static void main(String[] args) {
        IControllableDevice light = new SmartLight();
        IControllableDevice thermostat = new SmartThermostat();

        light.turnOn();
        light.getStatus();

        thermostat.turnOn();
        ((SmartThermostat) thermostat).setTemperature(20.0);
        thermostat.getStatus();
    }
}
