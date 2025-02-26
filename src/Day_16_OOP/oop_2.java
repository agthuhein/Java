package src.Day_16_OOP;

public class oop_2 {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice();
        smartDevice.brand = "Apple";
        smartDevice.model = "iPhone 15";
        smartDevice.batteryLife = 94;
        //smartDevice.isConnected = true;
        smartDevice.displayStatus();

        smartDevice.Connect();
        smartDevice.displayStatus();
        smartDevice.Disconnect();
        smartDevice.displayStatus();
    }
}
