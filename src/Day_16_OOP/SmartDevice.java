package src.Day_16_OOP;

public class SmartDevice {
    //Member variables (fields)
    String brand;
    String model;
    int batteryLife;
    boolean isConnected;

    //Constructors
    //Default Constructor - It is called when the obj is created.
    public SmartDevice(){
        brand = "Unknown";
        model = "Unknown";
        batteryLife = 0;
        isConnected = false;
    }
    //Parameterized Constructor
    public SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public SmartDevice(String brand, String model, int batteryLife) {
        this.brand = brand;
        this.model = model;
        this.batteryLife = batteryLife;
    }

    //Member methods
    void Connect() {
        System.out.println("Connecting to SmartDevice");
        isConnected = true;
    }
    void Disconnect() {
        System.out.println("Disconnecting from SmartDevice");
        isConnected = false;
    }
    void displayStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery life: " + batteryLife);
        System.out.println("Connected: " + isConnected);
    }
}
